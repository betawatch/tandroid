package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements xm7 {
    @Override // xm7
    public final void a(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package", a.b.getPackageName());
        bundle.putString("class", zm7.d.getClassName());
        bundle.putInt("badgenumber", i);
        hl.c3(new fe7(bundle, (byte) 9));
    }

    @Override // xm7
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
