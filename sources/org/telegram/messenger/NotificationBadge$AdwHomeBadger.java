package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class NotificationBadge$AdwHomeBadger implements yj7 {
    @Override // yj7
    public final void a(int i) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", ak7.d.getPackageName());
        intent.putExtra("CNAME", ak7.d.getClassName());
        intent.putExtra("COUNT", i);
        if (ak7.a(intent)) {
            gl.c3(new hk(intent, (byte) 1));
        }
    }

    @Override // yj7
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
