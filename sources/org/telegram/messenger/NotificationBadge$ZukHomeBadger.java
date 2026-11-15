package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements zr {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // org.telegram.messenger.zr
    public final void a(int i7) {
        g0.h3(new pq(11, this, r.b.f(i7, "app_badge_count")));
    }

    @Override // org.telegram.messenger.zr
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
