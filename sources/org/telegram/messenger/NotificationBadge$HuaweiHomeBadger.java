package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
