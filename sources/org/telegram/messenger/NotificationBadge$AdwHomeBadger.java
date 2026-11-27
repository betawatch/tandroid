package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class NotificationBadge$AdwHomeBadger implements xm7 {
    @Override // xm7
    public final void a(int i) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", zm7.d.getPackageName());
        intent.putExtra("CNAME", zm7.d.getClassName());
        intent.putExtra("COUNT", i);
        if (zm7.a(intent)) {
            hl.c3(new hk(intent, (byte) 1));
        }
    }

    @Override // xm7
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
