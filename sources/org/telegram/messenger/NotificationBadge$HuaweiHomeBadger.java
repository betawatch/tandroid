package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class NotificationBadge$HuaweiHomeBadger implements zr {
    @Override // org.telegram.messenger.zr
    public final void a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package", t0.b.getPackageName());
        bundle.putString("class", cs.d.getClassName());
        bundle.putInt("badgenumber", i7);
        g0.h3(new as(bundle, 0));
    }

    @Override // org.telegram.messenger.zr
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
