package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
