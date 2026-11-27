package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class NotificationBadge$NewHtcHomeBadger implements xm7 {
    @Override // xm7
    public final void a(int i) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", zm7.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", zm7.d.getPackageName());
        intent2.putExtra("count", i);
        if (zm7.a(intent) || zm7.a(intent2)) {
            hl.c3(new ql7(intent, intent2, (byte) 3));
        }
    }

    @Override // xm7
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
