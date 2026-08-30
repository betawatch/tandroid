package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public interface WebkitToCompatConverterBoundaryInterface {
    InvocationHandler convertCookieManager(Object obj);

    Object convertSafeBrowsingResponse(InvocationHandler invocationHandler);

    InvocationHandler convertSafeBrowsingResponse(Object obj);

    Object convertServiceWorkerSettings(InvocationHandler invocationHandler);

    InvocationHandler convertServiceWorkerSettings(Object obj);

    InvocationHandler convertSettings(WebSettings webSettings);

    Object convertWebMessagePort(InvocationHandler invocationHandler);

    InvocationHandler convertWebMessagePort(Object obj);

    Object convertWebResourceError(InvocationHandler invocationHandler);

    InvocationHandler convertWebResourceError(Object obj);

    InvocationHandler convertWebResourceRequest(WebResourceRequest webResourceRequest);

    InvocationHandler convertWebStorage(Object obj);
}
