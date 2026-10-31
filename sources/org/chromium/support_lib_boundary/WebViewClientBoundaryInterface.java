package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public interface WebViewClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onPageCommitVisible(WebView webView, String str);

    void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler);

    void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, InvocationHandler invocationHandler);

    boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest);
}
