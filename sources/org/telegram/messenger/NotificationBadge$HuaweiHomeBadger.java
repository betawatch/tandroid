package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
