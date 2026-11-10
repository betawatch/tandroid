package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ow0 implements c5.g {
    public int a;
    public final /* synthetic */ pw0 b;

    public ow0(pw0 pw0Var) {
        this.b = pw0Var;
    }

    @Override // c5.g
    public final void a(int i7) {
        pw0 pw0Var = this.b;
        ProfileActivity profileActivity = pw0Var.n;
        int k10 = profileActivity.n0.D0.k(i7);
        pw0Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.g0.i3(new uu0(pw0Var, 4), 500L);
        } else {
            pw0Var.c();
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
