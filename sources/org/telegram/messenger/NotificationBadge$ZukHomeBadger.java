package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements xm7 {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // xm7
    public final void a(int i) {
        hl.c3(new pl7(this, qu6.j(i, "app_badge_count"), (byte) 3));
    }

    @Override // xm7
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
