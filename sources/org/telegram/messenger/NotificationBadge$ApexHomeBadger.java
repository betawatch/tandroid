package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationBadge$ApexHomeBadger implements ls {
    @Override // org.telegram.messenger.ls
    public final void a(int i10) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", os.d.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra("class", os.d.getClassName());
        if (os.a(intent)) {
            i0.g3(new t(intent, 2));
        }
    }

    @Override // org.telegram.messenger.ls
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
