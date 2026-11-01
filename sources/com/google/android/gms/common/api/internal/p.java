package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class p {
    public final l5.p a;
    public volatile Object b;
    public volatile n c;

    public p(Looper looper, Object obj, String str) {
        this.a = new l5.p(looper);
        n6.l.h(obj, "Listener must not be null");
        this.b = obj;
        n6.l.e(str);
        this.c = new n(obj, str);
    }

    public final void a(o oVar) {
        this.a.execute(new s0(this, oVar));
    }
}
