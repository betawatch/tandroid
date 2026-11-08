package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lw0 implements c5.g {
    public int a;
    public final /* synthetic */ mw0 b;

    public lw0(mw0 mw0Var) {
        this.b = mw0Var;
    }

    @Override // c5.g
    public final void a(int i7) {
        mw0 mw0Var = this.b;
        ProfileActivity profileActivity = mw0Var.n;
        int k10 = profileActivity.n0.D0.k(i7);
        mw0Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.g0.i3(new ru0(mw0Var, 4), 500L);
        } else {
            mw0Var.c();
        }
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.f2) this.b.n).glassEngine;
        qVar.g();
    }

    @Override // c5.g
    public final void c(int i7) {
    }
}
