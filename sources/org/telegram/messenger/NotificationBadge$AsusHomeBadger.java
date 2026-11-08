package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class NotificationBadge$AsusHomeBadger implements cs {
    @Override // org.telegram.messenger.cs
    public final void a(int i7) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i7);
        intent.putExtra("badge_count_package_name", fs.d.getPackageName());
        intent.putExtra("badge_count_class_name", fs.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (fs.a(intent)) {
            g0.h3(new s(intent, 3));
        }
    }

    @Override // org.telegram.messenger.cs
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
