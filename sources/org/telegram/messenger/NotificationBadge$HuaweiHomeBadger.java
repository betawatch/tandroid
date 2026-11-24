package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements yj7 {
    @Override // yj7
    public final void a(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package", a.b.getPackageName());
        bundle.putString("class", ak7.d.getClassName());
        bundle.putInt("badgenumber", i);
        gl.d3(new vl6(bundle, (byte) 24));
    }

    @Override // yj7
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
