package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
