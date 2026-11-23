package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lw0 implements c5.h {
    public int a;
    public final /* synthetic */ mw0 b;

    public lw0(mw0 mw0Var) {
        this.b = mw0Var;
    }

    @Override // c5.h
    public final void a(int i7) {
        mw0 mw0Var = this.b;
        ProfileActivity profileActivity = mw0Var.n;
        int k10 = profileActivity.o0.E0.k(i7);
        mw0Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.r0 == null) {
            return;
        }
        if (profileActivity.T0.y()) {
            org.telegram.messenger.g0.h3(new qu0(mw0Var, 4), 500L);
        } else {
            mw0Var.c();
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.g2) this.b.n).glassEngine;
        qVar.g();
    }

    @Override // c5.h
    public final void c(int i7) {
    }
}
