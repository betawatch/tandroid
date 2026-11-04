package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements ur {
    @Override // org.telegram.messenger.ur
    public final void a(int i3) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", wr.d.getPackageName());
        intent.putExtra("count", i3);
        intent.putExtra("class", wr.d.getClassName());
        if (wr.a(intent)) {
            g0.h3(new s(intent, 2));
        }
    }

    @Override // org.telegram.messenger.ur
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
