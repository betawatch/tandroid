package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p {
    public final f6.a a;
    public volatile Object b;
    public volatile n c;

    public p(Looper looper, Object obj, String str) {
        this.a = new f6.a(looper);
        x5.l.i(obj, "Listener must not be null");
        this.b = obj;
        x5.l.f(str);
        this.c = new n(obj, str);
    }

    public final void a(o oVar) {
        this.a.execute(new r0(this, oVar));
    }
}
