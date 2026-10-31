package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationBadge$AdwHomeBadger implements ls {
    @Override // org.telegram.messenger.ls
    public final void a(int i10) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", os.d.getPackageName());
        intent.putExtra("CNAME", os.d.getClassName());
        intent.putExtra("COUNT", i10);
        if (os.a(intent)) {
            i0.g3(new t(intent, 1));
        }
    }

    @Override // org.telegram.messenger.ls
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
