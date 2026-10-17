package org.chromium.support_lib_boundary;

import java.util.Set;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z10);

    void setAllowFileAccess(boolean z10);

    void setBlockNetworkLoads(boolean z10);

    void setCacheMode(int i10);

    void setIncludeCookiesOnIntercept(boolean z10);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
