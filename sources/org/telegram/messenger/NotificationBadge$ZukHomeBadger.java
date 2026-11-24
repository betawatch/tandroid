package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements yj7 {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // yj7
    public final void a(int i) {
        gl.d3(new bj7(this, ls6.j(i, "app_badge_count"), (byte) 5));
    }

    @Override // yj7
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
