package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public interface WebViewProviderFactoryBoundaryInterface {
    public static final String MULTI_COOKIE_HEADER_NAME = "\u0000Set-Cookie-Multivalue\u0000";
    public static final String MULTI_COOKIE_VALUE_SEPARATOR = "\u0000";

    InvocationHandler createWebView(WebView webView);

    InvocationHandler getDropDataProvider();

    InvocationHandler getProfileStore();

    InvocationHandler getProxyController();

    InvocationHandler getServiceWorkerController();

    InvocationHandler getStatics();

    String[] getSupportedFeatures();

    InvocationHandler getTracingController();

    InvocationHandler getWebViewBuilder();

    InvocationHandler getWebkitToCompatConverter();

    void startUpWebView(InvocationHandler invocationHandler, InvocationHandler invocationHandler2);
}
