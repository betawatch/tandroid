package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class NotificationBadge$DefaultBadger implements zr {
    @Override // org.telegram.messenger.zr
    public final void a(int i7) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i7);
        intent.putExtra("badge_count_package_name", cs.d.getPackageName());
        intent.putExtra("badge_count_class_name", cs.d.getClassName());
        g0.h3(new s(intent, 4));
    }

    @Override // org.telegram.messenger.zr
    public final List b() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }
}
