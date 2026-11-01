package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class NotificationBadge$NewHtcHomeBadger implements ms {
    @Override // org.telegram.messenger.ms
    public final void a(int i10) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", ps.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i10);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", ps.d.getPackageName());
        intent2.putExtra("count", i10);
        if (ps.a(intent) || ps.a(intent2)) {
            i0.g3(new ir(7, intent, intent2));
        }
    }

    @Override // org.telegram.messenger.ms
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
