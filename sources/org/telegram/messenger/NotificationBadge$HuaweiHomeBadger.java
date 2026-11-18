package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements wr {
    @Override // org.telegram.messenger.wr
    public final void a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package", t0.b.getPackageName());
        bundle.putString("class", zr.d.getClassName());
        bundle.putInt("badgenumber", i7);
        g0.g3(new xr(bundle, 0));
    }

    @Override // org.telegram.messenger.wr
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
