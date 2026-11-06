package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements cs {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // org.telegram.messenger.cs
    public final void a(int i7) {
        g0.h3(new yq(10, this, rf.b.f(i7, "app_badge_count")));
    }

    @Override // org.telegram.messenger.cs
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
