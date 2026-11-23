package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements xr {
    @Override // org.telegram.messenger.xr
    public final void a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package", t0.b.getPackageName());
        bundle.putString("class", as.d.getClassName());
        bundle.putInt("badgenumber", i7);
        g0.g3(new yr(bundle, 0));
    }

    @Override // org.telegram.messenger.xr
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
