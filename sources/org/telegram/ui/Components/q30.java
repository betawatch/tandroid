package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class q30 implements gg.b2 {
    public final /* synthetic */ r30 a;

    public q30(r30 r30Var) {
        this.a = r30Var;
    }

    @Override // gg.b2
    public final /* synthetic */ a0.i F() {
        return null;
    }

    @Override // gg.b2
    public final /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // gg.b2
    public final void h(int i10) {
        r30 r30Var = this.a;
        s30 s30Var = r30Var.w;
        if (i10 < 0 || i10 != r30Var.n || r30Var.h) {
            return;
        }
        int i11 = r30Var.f - 1;
        boolean z10 = s30Var.s.getVisibility() == 0;
        r30Var.l();
        if (r30Var.f > i11) {
            s30Var.J(i11);
        }
        if (r30Var.d.e() || !s30Var.d.S0()) {
            return;
        }
        s30Var.s.e(false, z10);
    }

    @Override // gg.b2
    public final a0.i w() {
        return this.a.w.e0;
    }

    @Override // gg.b2
    public final /* synthetic */ void Q(ArrayList arrayList) {
    }
}
