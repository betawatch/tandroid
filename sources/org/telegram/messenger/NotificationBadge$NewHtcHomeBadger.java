package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationBadge$NewHtcHomeBadger implements ls {
    @Override // org.telegram.messenger.ls
    public final void a(int i10) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", os.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i10);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", os.d.getPackageName());
        intent2.putExtra("count", i10);
        if (os.a(intent) || os.a(intent2)) {
            i0.g3(new hr(7, intent, intent2));
        }
    }

    @Override // org.telegram.messenger.ls
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
