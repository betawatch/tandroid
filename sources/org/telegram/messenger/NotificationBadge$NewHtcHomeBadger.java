package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
