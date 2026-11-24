package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements yj7 {
    @Override // yj7
    public final void a(int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", ak7.d.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", ak7.d.getClassName());
        if (ak7.a(intent)) {
            gl.c3(new hk(intent, (byte) 2));
        }
    }

    @Override // yj7
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
