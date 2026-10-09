package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c0 implements Runnable {
    public final w0 a;
    public final t0 b;

    public c0(w0 w0Var, t0 t0Var) {
        this.a = w0Var;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        t0 t0Var = this.b;
        if (l0.h.f(this.a, this, w0.h(t0Var))) {
            w0.j(this.a);
        }
    }
}
