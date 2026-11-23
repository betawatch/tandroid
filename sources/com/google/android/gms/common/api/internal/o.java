package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
