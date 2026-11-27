package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements xm7 {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // xm7
    public final void a(int i) {
        hl.c3(new ql7(this, qu6.j(i, "app_badge_count"), (byte) 4));
    }

    @Override // xm7
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
