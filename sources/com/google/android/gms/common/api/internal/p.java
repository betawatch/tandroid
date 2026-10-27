package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class p {
    public final m5.q a;
    public volatile Object b;
    public volatile n c;

    public p(Looper looper, Object obj, String str) {
        this.a = new m5.q(looper);
        o6.l.i(obj, "Listener must not be null");
        this.b = obj;
        o6.l.f(str);
        this.c = new n(obj, str);
    }

    public final void a(o oVar) {
        this.a.execute(new q0(this, oVar));
    }
}
