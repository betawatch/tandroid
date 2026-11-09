package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nw0 implements c5.g {
    public int a;
    public final /* synthetic */ ow0 b;

    public nw0(ow0 ow0Var) {
        this.b = ow0Var;
    }

    @Override // c5.g
    public final void a(int i7) {
        ow0 ow0Var = this.b;
        ProfileActivity profileActivity = ow0Var.n;
        int k10 = profileActivity.n0.D0.k(i7);
        ow0Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.g0.i3(new tu0(ow0Var, 4), 500L);
        } else {
            ow0Var.c();
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
