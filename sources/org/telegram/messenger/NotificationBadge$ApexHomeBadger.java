package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements bm7 {
    @Override // bm7
    public final void a(int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", dm7.d.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", dm7.d.getClassName());
        if (dm7.a(intent)) {
            gm.c3(new hl(intent, (byte) 2));
        }
    }

    @Override // bm7
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
