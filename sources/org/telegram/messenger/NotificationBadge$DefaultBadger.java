package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationBadge$DefaultBadger implements ls {
    @Override // org.telegram.messenger.ls
    public final void a(int i10) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", os.d.getPackageName());
        intent.putExtra("badge_count_class_name", os.d.getClassName());
        i0.g3(new t(intent, 4));
    }

    @Override // org.telegram.messenger.ls
    public final List b() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }
}
