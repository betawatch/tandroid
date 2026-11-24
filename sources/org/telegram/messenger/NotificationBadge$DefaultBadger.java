package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class NotificationBadge$DefaultBadger implements bm7 {
    @Override // bm7
    public final void a(int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", dm7.d.getPackageName());
        intent.putExtra("badge_count_class_name", dm7.d.getClassName());
        gm.c3(new hl(intent, (byte) 4));
    }

    @Override // bm7
    public final List b() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }
}
