package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
