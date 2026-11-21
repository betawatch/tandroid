package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
