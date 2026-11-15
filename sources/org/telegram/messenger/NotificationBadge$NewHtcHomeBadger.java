package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class NotificationBadge$NewHtcHomeBadger implements zr {
    @Override // org.telegram.messenger.zr
    public final void a(int i7) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", cs.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i7);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", cs.d.getPackageName());
        intent2.putExtra("count", i7);
        if (cs.a(intent) || cs.a(intent2)) {
            g0.h3(new pq(10, intent, intent2));
        }
    }

    @Override // org.telegram.messenger.zr
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
