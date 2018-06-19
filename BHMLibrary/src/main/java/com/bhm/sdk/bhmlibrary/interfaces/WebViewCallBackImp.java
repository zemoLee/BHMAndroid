package com.bhm.sdk.bhmlibrary.interfaces;

import android.webkit.WebView;

/**
 * Created by bhm on 2018/3/28.
 */

public abstract class WebViewCallBackImp {

    public abstract boolean shouldOverrideUrlLoading(WebView view, String url);//一般返回true,自己处理url跳转

    public abstract void onPageStarted(WebView view, String url, android.graphics.Bitmap favicon);

    public abstract void onPageFinished(WebView view, String url);

    public abstract void onLoadResource(WebView view, String url);

    public abstract void onReceivedError(WebView view, int errorCode, String description, String failingUrl);

    public abstract void onReceivedTitle(WebView view, String title);
}