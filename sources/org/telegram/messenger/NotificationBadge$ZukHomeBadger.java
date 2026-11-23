package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements xr {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // org.telegram.messenger.xr
    public final void a(int i7) {
        g0.g3(new sq(12, this, p5.c.f(i7, "app_badge_count")));
    }

    @Override // org.telegram.messenger.xr
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
