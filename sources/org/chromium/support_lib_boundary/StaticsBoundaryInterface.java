package org.chromium.support_lib_boundary;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public interface StaticsBoundaryInterface {
    Uri getSafeBrowsingPrivacyPolicyUrl();

    String getVariationsHeader();

    void initSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback);

    boolean isMultiProcessEnabled();

    void setDefaultTrafficStatsTag(int i10);

    void setDefaultTrafficStatsUid(int i10);

    void setSafeBrowsingAllowlist(Set<String> set, ValueCallback<Boolean> valueCallback);

    void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback);
}
