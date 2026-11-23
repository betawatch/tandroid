package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
