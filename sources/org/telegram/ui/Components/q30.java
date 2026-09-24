package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class q30 implements gg.b2 {
    public final /* synthetic */ r30 a;

    public q30(r30 r30Var) {
        this.a = r30Var;
    }

    @Override // gg.b2
    public final void a(int i10) {
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
