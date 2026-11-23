package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements xr {
    @Override // org.telegram.messenger.xr
    public final void a(int i7) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", as.d.getPackageName());
        intent.putExtra("count", i7);
        intent.putExtra("class", as.d.getClassName());
        if (as.a(intent)) {
            g0.g3(new s(intent, 2));
        }
    }

    @Override // org.telegram.messenger.xr
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
