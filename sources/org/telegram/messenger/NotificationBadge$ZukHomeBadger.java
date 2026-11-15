package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements zr {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // org.telegram.messenger.zr
    public final void a(int i7) {
        g0.h3(new wq(10, this, r.b.f(i7, "app_badge_count")));
    }

    @Override // org.telegram.messenger.zr
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
