package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements wr {
    @Override // org.telegram.messenger.wr
    public final void a(int i7) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", zr.d.getPackageName());
        intent.putExtra("count", i7);
        intent.putExtra("class", zr.d.getClassName());
        if (zr.a(intent)) {
            g0.g3(new s(intent, 2));
        }
    }

    @Override // org.telegram.messenger.wr
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
