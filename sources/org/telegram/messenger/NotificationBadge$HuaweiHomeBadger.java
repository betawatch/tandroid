package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
