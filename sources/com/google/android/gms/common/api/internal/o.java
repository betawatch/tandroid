package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
