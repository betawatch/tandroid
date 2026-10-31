package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public interface WebViewNavigationClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onFirstContentfulPaint(InvocationHandler invocationHandler);

    void onNavigationCompleted(InvocationHandler invocationHandler);

    void onNavigationRedirected(InvocationHandler invocationHandler);

    void onNavigationStarted(InvocationHandler invocationHandler);

    void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler);

    void onPageDeleted(InvocationHandler invocationHandler);

    void onPageLoadEventFired(InvocationHandler invocationHandler);
}
