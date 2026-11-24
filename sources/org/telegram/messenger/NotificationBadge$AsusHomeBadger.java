package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class NotificationBadge$AsusHomeBadger implements bm7 {
    @Override // bm7
    public final void a(int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", dm7.d.getPackageName());
        intent.putExtra("badge_count_class_name", dm7.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (dm7.a(intent)) {
            gm.c3(new hl(intent, (byte) 3));
        }
    }

    @Override // bm7
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
