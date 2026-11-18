package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class NotificationBadge$AdwHomeBadger implements wr {
    @Override // org.telegram.messenger.wr
    public final void a(int i7) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", zr.d.getPackageName());
        intent.putExtra("CNAME", zr.d.getClassName());
        intent.putExtra("COUNT", i7);
        if (zr.a(intent)) {
            g0.g3(new s(intent, 1));
        }
    }

    @Override // org.telegram.messenger.wr
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
