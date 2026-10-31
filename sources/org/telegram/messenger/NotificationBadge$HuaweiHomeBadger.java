package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements ls {
    @Override // org.telegram.messenger.ls
    public final void a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package", w0.b.getPackageName());
        bundle.putString("class", os.d.getClassName());
        bundle.putInt("badgenumber", i10);
        i0.g3(new ms(bundle, 0));
    }

    @Override // org.telegram.messenger.ls
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
