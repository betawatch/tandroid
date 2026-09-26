package org.chromium.support_lib_boundary;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
