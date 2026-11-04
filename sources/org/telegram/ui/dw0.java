package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dw0 implements b5.h {
    public int a;
    public final /* synthetic */ ew0 b;

    public dw0(ew0 ew0Var) {
        this.b = ew0Var;
    }

    @Override // b5.h
    public final void a(int i3) {
        ew0 ew0Var = this.b;
        ProfileActivity profileActivity = ew0Var.n;
        int k10 = profileActivity.o0.E0.k(i3);
        ew0Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.r0 == null) {
            return;
        }
        if (profileActivity.T0.x()) {
            org.telegram.messenger.g0.i3(new pu0(ew0Var, 3), 500L);
        } else {
            ew0Var.c();
        }
    }

    @Override // b5.h
    public final void b(float f10, int i3, int i10) {
        pi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.d2) this.b.n).glassEngine;
        qVar.g();
    }

    @Override // b5.h
    public final void c(int i3) {
    }
}
