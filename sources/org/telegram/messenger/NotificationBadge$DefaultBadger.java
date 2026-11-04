package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class NotificationBadge$DefaultBadger implements ur {
    @Override // org.telegram.messenger.ur
    public final void a(int i3) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i3);
        intent.putExtra("badge_count_package_name", wr.d.getPackageName());
        intent.putExtra("badge_count_class_name", wr.d.getClassName());
        g0.h3(new s(intent, 4));
    }

    @Override // org.telegram.messenger.ur
    public final List b() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }
}
