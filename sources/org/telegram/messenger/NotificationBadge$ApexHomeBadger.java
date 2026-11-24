package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements yj7 {
    @Override // yj7
    public final void a(int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", ak7.d.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", ak7.d.getClassName());
        if (ak7.a(intent)) {
            gl.d3(new hk(intent, (byte) 2));
        }
    }

    @Override // yj7
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
