package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
