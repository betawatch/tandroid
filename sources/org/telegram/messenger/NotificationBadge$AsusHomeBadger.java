package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class NotificationBadge$AsusHomeBadger implements xr {
    @Override // org.telegram.messenger.xr
    public final void a(int i7) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i7);
        intent.putExtra("badge_count_package_name", as.d.getPackageName());
        intent.putExtra("badge_count_class_name", as.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (as.a(intent)) {
            g0.g3(new s(intent, 3));
        }
    }

    @Override // org.telegram.messenger.xr
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
