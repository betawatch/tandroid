package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
