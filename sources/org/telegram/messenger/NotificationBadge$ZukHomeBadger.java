package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
