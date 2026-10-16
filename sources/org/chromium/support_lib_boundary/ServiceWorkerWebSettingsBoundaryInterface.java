package org.chromium.support_lib_boundary;

import java.util.Set;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
