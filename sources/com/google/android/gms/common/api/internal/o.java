package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o {
    public final n5.p a;
    public volatile m b;

    public o(Looper looper, Object obj, String str) {
        this.a = new n5.p(looper);
        p6.m.h(obj, "Listener must not be null");
        p6.m.e(str);
        this.b = new m(obj, str);
    }

    public final void a(n nVar) {
        this.a.execute(new l0(this, nVar));
    }
}
