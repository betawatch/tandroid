package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t30 implements uf.j1 {
    public final /* synthetic */ u30 a;

    public t30(u30 u30Var) {
        this.a = u30Var;
    }

    @Override // uf.j1
    public final /* synthetic */ a0.h K() {
        return null;
    }

    @Override // uf.j1
    public final /* synthetic */ boolean R(int i10) {
        return true;
    }

    @Override // uf.j1
    public final void g(int i10) {
        u30 u30Var = this.a;
        v30 v30Var = u30Var.w;
        if (i10 < 0 || i10 != u30Var.n || u30Var.h) {
            return;
        }
        int i11 = u30Var.f - 1;
        boolean z4 = v30Var.s.getVisibility() == 0;
        u30Var.l();
        if (u30Var.f > i11) {
            v30Var.I(i11);
        }
        if (u30Var.d.e() || !v30Var.d.S0()) {
            return;
        }
        v30Var.s.e(false, z4);
    }

    @Override // uf.j1
    public final a0.h y() {
        return this.a.w.b0;
    }

    @Override // uf.j1
    public final /* synthetic */ void V(ArrayList arrayList) {
    }
}
