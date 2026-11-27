package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class NotificationBadge$AsusHomeBadger implements xm7 {
    @Override // xm7
    public final void a(int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", zm7.d.getPackageName());
        intent.putExtra("badge_count_class_name", zm7.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (zm7.a(intent)) {
            hl.c3(new hk(intent, (byte) 3));
        }
    }

    @Override // xm7
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
