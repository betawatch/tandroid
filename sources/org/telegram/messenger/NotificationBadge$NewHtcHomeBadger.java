package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class NotificationBadge$NewHtcHomeBadger implements ur {
    @Override // org.telegram.messenger.ur
    public final void a(int i3) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", wr.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i3);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", wr.d.getPackageName());
        intent2.putExtra("count", i3);
        if (wr.a(intent) || wr.a(intent2)) {
            g0.h3(new pq(9, intent, intent2));
        }
    }

    @Override // org.telegram.messenger.ur
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
