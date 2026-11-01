package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class NotificationBadge$ZukHomeBadger implements ms {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // org.telegram.messenger.ms
    public final void a(int i10) {
        i0.g3(new ir(8, this, org.telegram.ui.Cells.f1.i(i10, "app_badge_count")));
    }

    @Override // org.telegram.messenger.ms
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
