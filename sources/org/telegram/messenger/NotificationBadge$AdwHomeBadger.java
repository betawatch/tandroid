package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
