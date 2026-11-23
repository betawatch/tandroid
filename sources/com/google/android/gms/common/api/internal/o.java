package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class o {
    public final o5.p a;
    public volatile m b;

    public o(Looper looper, Object obj, String str) {
        this.a = new o5.p(looper);
        q6.m.i(obj, "Listener must not be null");
        q6.m.f(str);
        this.b = new m(obj, str);
    }

    public final void a(n nVar) {
        this.a.execute(new n0(this, nVar));
    }
}
