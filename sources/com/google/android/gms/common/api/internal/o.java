package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class o {
    public final o5.q a;
    public volatile m b;

    public o(Looper looper, Object obj, String str) {
        this.a = new o5.q(looper);
        q6.m.i(obj, "Listener must not be null");
        q6.m.f(str);
        this.b = new m(obj, str);
    }

    public final void a(n nVar) {
        this.a.execute(new m0(this, nVar));
    }
}
