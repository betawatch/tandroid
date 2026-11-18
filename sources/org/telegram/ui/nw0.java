package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class nw0 implements c5.h {
    public int a;
    public final /* synthetic */ ow0 b;

    public nw0(ow0 ow0Var) {
        this.b = ow0Var;
    }

    @Override // c5.h
    public final void a(int i7) {
        ow0 ow0Var = this.b;
        ProfileActivity profileActivity = ow0Var.n;
        int k10 = profileActivity.o0.E0.k(i7);
        ow0Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.r0 == null) {
            return;
        }
        if (profileActivity.T0.y()) {
            org.telegram.messenger.g0.h3(new ru0(ow0Var, 4), 500L);
        } else {
            ow0Var.c();
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.h2) this.b.n).glassEngine;
        qVar.g();
    }

    @Override // c5.h
    public final void c(int i7) {
    }
}
