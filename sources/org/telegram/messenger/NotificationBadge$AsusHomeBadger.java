package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class NotificationBadge$AsusHomeBadger implements yj7 {
    @Override // yj7
    public final void a(int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", ak7.d.getPackageName());
        intent.putExtra("badge_count_class_name", ak7.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (ak7.a(intent)) {
            gl.d3(new hk(intent, (byte) 3));
        }
    }

    @Override // yj7
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
