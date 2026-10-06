package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class t30 implements gg.b2 {
    public final /* synthetic */ u30 a;

    public t30(u30 u30Var) {
        this.a = u30Var;
    }

    @Override // gg.b2
    public final void a(int i10) {
        u30 u30Var = this.a;
        v30 v30Var = u30Var.w;
        if (i10 < 0 || i10 != u30Var.n || u30Var.h) {
            return;
        }
        int i11 = u30Var.f - 1;
        boolean z10 = v30Var.s.getVisibility() == 0;
        u30Var.l();
        if (u30Var.f > i11) {
            v30Var.H(i11);
        }
        if (u30Var.d.e() || !v30Var.d.S0()) {
            return;
        }
        v30Var.s.e(false, z10);
    }

    @Override // gg.b2
    public final a0.i s() {
        return this.a.w.e0;
    }

    @Override // gg.b2
    public final /* synthetic */ a0.i x() {
        return null;
    }

    @Override // gg.b2
    public final /* synthetic */ boolean z(int i10) {
        return true;
    }

    @Override // gg.b2
    public final /* synthetic */ void F(ArrayList arrayList) {
    }
}
