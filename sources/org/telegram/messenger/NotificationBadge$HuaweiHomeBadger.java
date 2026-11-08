package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
