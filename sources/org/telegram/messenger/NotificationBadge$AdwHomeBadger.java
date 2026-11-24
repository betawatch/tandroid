package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class NotificationBadge$AdwHomeBadger implements yj7 {
    @Override // yj7
    public final void a(int i) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", ak7.d.getPackageName());
        intent.putExtra("CNAME", ak7.d.getClassName());
        intent.putExtra("COUNT", i);
        if (ak7.a(intent)) {
            gl.d3(new hk(intent, (byte) 1));
        }
    }

    @Override // yj7
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
