package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements xm7 {
    @Override // xm7
    public final void a(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package", a.b.getPackageName());
        bundle.putString("class", zm7.d.getClassName());
        bundle.putInt("badgenumber", i);
        hl.c3(new ge7(bundle, (byte) 9));
    }

    @Override // xm7
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
