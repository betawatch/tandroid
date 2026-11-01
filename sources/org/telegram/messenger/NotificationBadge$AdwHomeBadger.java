package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class NotificationBadge$AdwHomeBadger implements ms {
    @Override // org.telegram.messenger.ms
    public final void a(int i10) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", ps.d.getPackageName());
        intent.putExtra("CNAME", ps.d.getClassName());
        intent.putExtra("COUNT", i10);
        if (ps.a(intent)) {
            i0.g3(new t(intent, 1));
        }
    }

    @Override // org.telegram.messenger.ms
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
