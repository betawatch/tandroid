package org.chromium.support_lib_boundary;

import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z4);

    void setAllowFileAccess(boolean z4);

    void setBlockNetworkLoads(boolean z4);

    void setCacheMode(int i10);

    void setIncludeCookiesOnIntercept(boolean z4);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
