package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x20 implements zf.l1 {
    public final /* synthetic */ y20 a;

    public x20(y20 y20Var) {
        this.a = y20Var;
    }

    @Override // zf.l1
    public final /* synthetic */ a0.h M() {
        return null;
    }

    @Override // zf.l1
    public final /* synthetic */ boolean Y(int i10) {
        return true;
    }

    @Override // zf.l1
    public final void i(int i10) {
        y20 y20Var = this.a;
        z20 z20Var = y20Var.x;
        if (i10 < 0 || i10 != y20Var.n || y20Var.h) {
            return;
        }
        int i11 = y20Var.f - 1;
        boolean z10 = z20Var.q1.getVisibility() == 0;
        y20Var.f();
        if (y20Var.f > i11) {
            z20Var.O0(i11);
        }
        if (y20Var.d.e() || !z20Var.k1.R0()) {
            return;
        }
        z20Var.q1.e(false, z10);
    }

    @Override // zf.l1
    public final a0.h x() {
        return this.a.x.V1;
    }

    @Override // zf.l1
    public final /* synthetic */ void c0(ArrayList arrayList) {
    }
}
