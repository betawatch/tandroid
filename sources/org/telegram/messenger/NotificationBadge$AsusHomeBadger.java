package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class NotificationBadge$AsusHomeBadger implements xm7 {
    @Override // xm7
    public final void a(int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", zm7.d.getPackageName());
        intent.putExtra("badge_count_class_name", zm7.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (zm7.a(intent)) {
            hl.c3(new hk(intent, (byte) 3));
        }
    }

    @Override // xm7
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
