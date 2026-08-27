package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e30 implements pf.i1 {
    public final /* synthetic */ f30 a;

    public e30(f30 f30Var) {
        this.a = f30Var;
    }

    @Override // pf.i1
    public final /* synthetic */ boolean D0(int i10) {
        return true;
    }

    @Override // pf.i1
    public final a0.h J() {
        return this.a.w.a0;
    }

    @Override // pf.i1
    public final /* synthetic */ a0.h h0() {
        return null;
    }

    @Override // pf.i1
    public final void i(int i10) {
        f30 f30Var = this.a;
        g30 g30Var = f30Var.w;
        if (i10 < 0 || i10 != f30Var.n || f30Var.h) {
            return;
        }
        int i11 = f30Var.f - 1;
        boolean z10 = g30Var.s.getVisibility() == 0;
        f30Var.l();
        if (f30Var.f > i11) {
            g30Var.J(i11);
        }
        if (f30Var.d.e() || !g30Var.d.S0()) {
            return;
        }
        g30Var.s.e(false, z10);
    }

    @Override // pf.i1
    public final /* synthetic */ void V0(ArrayList arrayList) {
    }
}
