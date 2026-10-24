package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        this.a.execute(new q0(this, oVar));
    }
}
