package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/")
	public String hello(Model model)
	{
		model.addAttribute("mes", "Maven SpringBoot");
		return "hello";
	}
	
/*	@ResponseBody public String hello()
	{
		return "hello";
	}*/
}
