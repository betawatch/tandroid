package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g40 implements gg.a2 {
    public final /* synthetic */ h40 a;

    public g40(h40 h40Var) {
        this.a = h40Var;
    }

    @Override // gg.a2
    public final a0.i V() {
        return this.a.w.e0;
    }

    @Override // gg.a2
    public final /* synthetic */ a0.i d0() {
        return null;
    }

    @Override // gg.a2
    public final void h(int i10) {
        h40 h40Var = this.a;
        i40 i40Var = h40Var.w;
        if (i10 < 0 || i10 != h40Var.n || h40Var.h) {
            return;
        }
        int i11 = h40Var.f - 1;
        boolean z10 = i40Var.s.getVisibility() == 0;
        h40Var.l();
        if (h40Var.f > i11) {
            i40Var.K(i11);
        }
        if (h40Var.d.e() || !i40Var.d.S0()) {
            return;
        }
        i40Var.s.e(false, z10);
    }

    @Override // gg.a2
    public final /* synthetic */ boolean s0(int i10) {
        return true;
    }

    @Override // gg.a2
    public final /* synthetic */ void x0(ArrayList arrayList) {
    }
}
