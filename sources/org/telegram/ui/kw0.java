package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class kw0 implements c5.h {
    public int a;
    public final /* synthetic */ lw0 b;

    public kw0(lw0 lw0Var) {
        this.b = lw0Var;
    }

    @Override // c5.h
    public final void a(int i7) {
        lw0 lw0Var = this.b;
        ProfileActivity profileActivity = lw0Var.n;
        int k10 = profileActivity.o0.E0.k(i7);
        lw0Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.r0 == null) {
            return;
        }
        if (profileActivity.T0.y()) {
            org.telegram.messenger.g0.i3(new pu0(lw0Var, 4), 500L);
        } else {
            lw0Var.c();
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.e2) this.b.n).glassEngine;
        qVar.g();
    }

    @Override // c5.h
    public final void c(int i7) {
    }
}
