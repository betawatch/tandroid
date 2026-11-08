package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements cs {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // org.telegram.messenger.cs
    public final void a(int i7) {
        g0.h3(new zq(10, this, rf.b.f(i7, "app_badge_count")));
    }

    @Override // org.telegram.messenger.cs
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
