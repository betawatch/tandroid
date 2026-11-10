package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class NotificationBadge$AdwHomeBadger implements cs {
    @Override // org.telegram.messenger.cs
    public final void a(int i7) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", fs.d.getPackageName());
        intent.putExtra("CNAME", fs.d.getClassName());
        intent.putExtra("COUNT", i7);
        if (fs.a(intent)) {
            g0.h3(new s(intent, 1));
        }
    }

    @Override // org.telegram.messenger.cs
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
