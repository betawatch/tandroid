package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
