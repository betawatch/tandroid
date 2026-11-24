package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements bm7 {
    @Override // bm7
    public final void a(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package", a.b.getPackageName());
        bundle.putString("class", dm7.d.getClassName());
        bundle.putInt("badgenumber", i);
        gm.c3(new kl7(bundle, (byte) 1));
    }

    @Override // bm7
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
