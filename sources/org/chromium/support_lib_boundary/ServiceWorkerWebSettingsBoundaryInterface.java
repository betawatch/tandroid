package org.chromium.support_lib_boundary;

import java.util.Set;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
