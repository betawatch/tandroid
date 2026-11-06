package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements cs {
    @Override // org.telegram.messenger.cs
    public final void a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package", t0.b.getPackageName());
        bundle.putString("class", fs.d.getClassName());
        bundle.putInt("badgenumber", i7);
        g0.h3(new ds(bundle, 0));
    }

    @Override // org.telegram.messenger.cs
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
