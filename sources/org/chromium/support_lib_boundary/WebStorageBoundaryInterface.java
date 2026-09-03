package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public interface WebStorageBoundaryInterface {
    void deleteBrowsingData(Executor executor, Runnable runnable);

    String deleteBrowsingDataForSite(String str, Executor executor, Runnable runnable);
}
