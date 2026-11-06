package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements cs {
    @Override // org.telegram.messenger.cs
    public final void a(int i7) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", fs.d.getPackageName());
        intent.putExtra("count", i7);
        intent.putExtra("class", fs.d.getClassName());
        if (fs.a(intent)) {
            g0.h3(new s(intent, 2));
        }
    }

    @Override // org.telegram.messenger.cs
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
