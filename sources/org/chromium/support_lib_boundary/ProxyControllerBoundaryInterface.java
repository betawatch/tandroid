package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public interface ProxyControllerBoundaryInterface {
    void clearProxyOverride(Runnable runnable, Executor executor);

    void setProxyOverride(String[][] strArr, String[] strArr2, Runnable runnable, Executor executor);

    void setProxyOverride(String[][] strArr, String[] strArr2, Runnable runnable, Executor executor, boolean z10);
}
