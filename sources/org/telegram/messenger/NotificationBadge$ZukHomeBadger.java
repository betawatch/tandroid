package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements wr {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // org.telegram.messenger.wr
    public final void a(int i7) {
        g0.g3(new rq(12, this, p5.c.f(i7, "app_badge_count")));
    }

    @Override // org.telegram.messenger.wr
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
