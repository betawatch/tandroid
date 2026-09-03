package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p {
    public final j6.a a;
    public volatile Object b;
    public volatile n c;

    public p(Looper looper, Object obj, String str) {
        this.a = new j6.a(looper);
        b6.m.i(obj, "Listener must not be null");
        this.b = obj;
        b6.m.f(str);
        this.c = new n(obj, str);
    }

    public final void a(o oVar) {
        this.a.execute(new r0(this, oVar));
    }
}
