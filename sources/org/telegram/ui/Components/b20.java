package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b20 implements kg.u1 {
    public final /* synthetic */ c20 a;

    public b20(c20 c20Var) {
        this.a = c20Var;
    }

    @Override // kg.u1
    public final a0.h C0() {
        return this.a.x.W1;
    }

    @Override // kg.u1
    public final /* synthetic */ boolean J1(int i3) {
        return true;
    }

    @Override // kg.u1
    public final /* synthetic */ a0.h k1() {
        return null;
    }

    @Override // kg.u1
    public final void r(int i3) {
        c20 c20Var = this.a;
        d20 d20Var = c20Var.x;
        if (i3 < 0 || i3 != c20Var.n || c20Var.h) {
            return;
        }
        int i10 = c20Var.f - 1;
        boolean z10 = d20Var.r1.getVisibility() == 0;
        c20Var.f();
        if (c20Var.f > i10) {
            d20Var.O0(i10);
        }
        if (c20Var.d.e() || !d20Var.l1.R0()) {
            return;
        }
        d20Var.r1.e(false, z10);
    }

    @Override // kg.u1
    public final /* synthetic */ void b2(ArrayList arrayList) {
    }
}
