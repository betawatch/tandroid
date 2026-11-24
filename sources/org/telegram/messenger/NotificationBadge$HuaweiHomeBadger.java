package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements yj7 {
    @Override // yj7
    public final void a(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package", a.b.getPackageName());
        bundle.putString("class", ak7.d.getClassName());
        bundle.putInt("badgenumber", i);
        gl.c3(new vl6(bundle, (byte) 24));
    }

    @Override // yj7
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
