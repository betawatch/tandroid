package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
