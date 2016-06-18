package com.tests;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AppTest 
{
	@Test
	public void login()
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	driver.quit();
	}
}
