package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
