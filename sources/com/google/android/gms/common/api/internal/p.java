package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class p {
    public final l5.q a;
    public volatile Object b;
    public volatile n c;

    public p(Looper looper, Object obj, String str) {
        this.a = new l5.q(looper);
        n6.l.i(obj, "Listener must not be null");
        this.b = obj;
        n6.l.f(str);
        this.c = new n(obj, str);
    }

    public final void a(o oVar) {
        this.a.execute(new r0(this, oVar));
    }
}
