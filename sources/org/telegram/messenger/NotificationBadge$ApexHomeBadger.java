package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements zr {
    @Override // org.telegram.messenger.zr
    public final void a(int i7) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", cs.d.getPackageName());
        intent.putExtra("count", i7);
        intent.putExtra("class", cs.d.getClassName());
        if (cs.a(intent)) {
            g0.h3(new s(intent, 2));
        }
    }

    @Override // org.telegram.messenger.zr
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
