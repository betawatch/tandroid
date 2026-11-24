package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements yj7 {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // yj7
    public final void a(int i) {
        gl.c3(new bj7(this, ls6.j(i, "app_badge_count"), (byte) 5));
    }

    @Override // yj7
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
