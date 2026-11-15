package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class NotificationBadge$AdwHomeBadger implements zr {
    @Override // org.telegram.messenger.zr
    public final void a(int i7) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", cs.d.getPackageName());
        intent.putExtra("CNAME", cs.d.getClassName());
        intent.putExtra("COUNT", i7);
        if (cs.a(intent)) {
            g0.h3(new s(intent, 1));
        }
    }

    @Override // org.telegram.messenger.zr
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
