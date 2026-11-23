package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
