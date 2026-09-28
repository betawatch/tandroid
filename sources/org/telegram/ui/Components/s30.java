package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class s30 implements gg.b2 {
    public final /* synthetic */ t30 a;

    public s30(t30 t30Var) {
        this.a = t30Var;
    }

    @Override // gg.b2
    public final void a(int i10) {
        t30 t30Var = this.a;
        u30 u30Var = t30Var.w;
        if (i10 < 0 || i10 != t30Var.n || t30Var.h) {
            return;
        }
        int i11 = t30Var.f - 1;
        boolean z10 = u30Var.s.getVisibility() == 0;
        t30Var.l();
        if (t30Var.f > i11) {
            u30Var.J(i11);
        }
        if (t30Var.d.e() || !u30Var.d.S0()) {
            return;
        }
        u30Var.s.e(false, z10);
    }

    @Override // gg.b2
    public final a0.i i() {
        return this.a.w.e0;
    }

    @Override // gg.b2
    public final /* synthetic */ a0.i o() {
        return null;
    }

    @Override // gg.b2
    public final /* synthetic */ boolean s(int i10) {
        return true;
    }

    @Override // gg.b2
    public final /* synthetic */ void F(ArrayList arrayList) {
    }
}
