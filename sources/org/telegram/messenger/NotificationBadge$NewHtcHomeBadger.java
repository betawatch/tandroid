package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class NotificationBadge$NewHtcHomeBadger implements cs {
    @Override // org.telegram.messenger.cs
    public final void a(int i7) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", fs.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i7);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", fs.d.getPackageName());
        intent2.putExtra("count", i7);
        if (fs.a(intent) || fs.a(intent2)) {
            g0.h3(new zq(9, intent, intent2));
        }
    }

    @Override // org.telegram.messenger.cs
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
