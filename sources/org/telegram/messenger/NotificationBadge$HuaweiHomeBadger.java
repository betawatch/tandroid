package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements ms {
    @Override // org.telegram.messenger.ms
    public final void a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package", w0.b.getPackageName());
        bundle.putString("class", ps.d.getClassName());
        bundle.putInt("badgenumber", i10);
        i0.g3(new ns(bundle, 0));
    }

    @Override // org.telegram.messenger.ms
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
