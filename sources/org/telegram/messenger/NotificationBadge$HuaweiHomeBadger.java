package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements ur {
    @Override // org.telegram.messenger.ur
    public final void a(int i3) {
        Bundle bundle = new Bundle();
        bundle.putString("package", t0.b.getPackageName());
        bundle.putString("class", wr.d.getClassName());
        bundle.putInt("badgenumber", i3);
        g0.h3(new a(bundle, 29));
    }

    @Override // org.telegram.messenger.ur
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
