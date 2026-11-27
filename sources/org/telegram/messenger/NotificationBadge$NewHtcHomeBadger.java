package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
            hl.c3(new pl7(intent, intent2, (byte) 2));
        }
    }

    @Override // xm7
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
