package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
