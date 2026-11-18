package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class NotificationBadge$NewHtcHomeBadger implements wr {
    @Override // org.telegram.messenger.wr
    public final void a(int i7) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", zr.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i7);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", zr.d.getPackageName());
        intent2.putExtra("count", i7);
        if (zr.a(intent) || zr.a(intent2)) {
            g0.g3(new rq(11, intent, intent2));
        }
    }

    @Override // org.telegram.messenger.wr
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
