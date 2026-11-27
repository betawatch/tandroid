package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
