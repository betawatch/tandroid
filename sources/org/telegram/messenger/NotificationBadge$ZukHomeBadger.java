package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements ur {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // org.telegram.messenger.ur
    public final void a(int i3) {
        g0.h3(new pq(10, this, org.telegram.ui.Cells.f1.k(i3, "app_badge_count")));
    }

    @Override // org.telegram.messenger.ur
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
