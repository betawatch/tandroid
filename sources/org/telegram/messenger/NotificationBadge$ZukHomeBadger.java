package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements wr {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // org.telegram.messenger.wr
    public final void a(int i7) {
        g0.g3(new rq(12, this, p5.c.f(i7, "app_badge_count")));
    }

    @Override // org.telegram.messenger.wr
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
