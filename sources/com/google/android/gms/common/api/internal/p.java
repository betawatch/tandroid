package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
