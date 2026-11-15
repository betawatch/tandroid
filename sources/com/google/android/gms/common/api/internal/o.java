package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class o {
    public final o5.q a;
    public volatile m b;

    public o(Looper looper, Object obj, String str) {
        this.a = new o5.q(looper);
        q6.m.h(obj, "Listener must not be null");
        q6.m.e(str);
        this.b = new m(obj, str);
    }

    public final void a(n nVar) {
        this.a.execute(new n0(this, nVar));
    }
}
