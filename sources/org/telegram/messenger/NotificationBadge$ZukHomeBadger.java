package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements ls {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // org.telegram.messenger.ls
    public final void a(int i10) {
        i0.g3(new hr(8, this, org.telegram.ui.Cells.f1.i(i10, "app_badge_count")));
    }

    @Override // org.telegram.messenger.ls
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
