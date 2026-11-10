package org.chromium.support_lib_boundary;

import java.util.Set;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z9);

    void setAllowFileAccess(boolean z9);

    void setBlockNetworkLoads(boolean z9);

    void setCacheMode(int i7);

    void setIncludeCookiesOnIntercept(boolean z9);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
