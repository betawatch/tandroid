package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
