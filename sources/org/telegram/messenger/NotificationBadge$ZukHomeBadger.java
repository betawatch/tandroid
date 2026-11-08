package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
