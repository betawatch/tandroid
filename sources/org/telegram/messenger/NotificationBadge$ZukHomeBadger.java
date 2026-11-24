package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements bm7 {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // bm7
    public final void a(int i) {
        gm.c3(new bl7(this, kt6.j(i, "app_badge_count"), (byte) 6));
    }

    @Override // bm7
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
