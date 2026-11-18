package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class NotificationBadge$AsusHomeBadger implements wr {
    @Override // org.telegram.messenger.wr
    public final void a(int i7) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i7);
        intent.putExtra("badge_count_package_name", zr.d.getPackageName());
        intent.putExtra("badge_count_class_name", zr.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (zr.a(intent)) {
            g0.g3(new s(intent, 3));
        }
    }

    @Override // org.telegram.messenger.wr
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
