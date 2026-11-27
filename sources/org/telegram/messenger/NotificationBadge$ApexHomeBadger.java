package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements xm7 {
    @Override // xm7
    public final void a(int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", zm7.d.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", zm7.d.getClassName());
        if (zm7.a(intent)) {
            hl.c3(new hk(intent, (byte) 2));
        }
    }

    @Override // xm7
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
