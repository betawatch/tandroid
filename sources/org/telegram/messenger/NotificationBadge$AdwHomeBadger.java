package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class NotificationBadge$AdwHomeBadger implements xr {
    @Override // org.telegram.messenger.xr
    public final void a(int i7) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", as.d.getPackageName());
        intent.putExtra("CNAME", as.d.getClassName());
        intent.putExtra("COUNT", i7);
        if (as.a(intent)) {
            g0.g3(new s(intent, 1));
        }
    }

    @Override // org.telegram.messenger.xr
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
