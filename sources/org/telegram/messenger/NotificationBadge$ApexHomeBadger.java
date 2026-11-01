package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements ms {
    @Override // org.telegram.messenger.ms
    public final void a(int i10) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", ps.d.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra("class", ps.d.getClassName());
        if (ps.a(intent)) {
            i0.g3(new t(intent, 2));
        }
    }

    @Override // org.telegram.messenger.ms
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
