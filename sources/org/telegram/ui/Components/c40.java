package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c40 implements hg.z1 {
    public final /* synthetic */ d40 a;

    public c40(d40 d40Var) {
        this.a = d40Var;
    }

    @Override // hg.z1
    public final a0.h K() {
        return this.a.w.e0;
    }

    @Override // hg.z1
    public final /* synthetic */ a0.h j0() {
        return null;
    }

    @Override // hg.z1
    public final void k(int i10) {
        d40 d40Var = this.a;
        e40 e40Var = d40Var.w;
        if (i10 < 0 || i10 != d40Var.n || d40Var.h) {
            return;
        }
        int i11 = d40Var.f - 1;
        boolean z10 = e40Var.s.getVisibility() == 0;
        d40Var.l();
        if (d40Var.f > i11) {
            e40Var.K(i11);
        }
        if (d40Var.d.e() || !e40Var.d.S0()) {
            return;
        }
        e40Var.s.e(false, z10);
    }

    @Override // hg.z1
    public final /* synthetic */ boolean t0(int i10) {
        return true;
    }

    @Override // hg.z1
    public final /* synthetic */ void I0(ArrayList arrayList) {
    }
}
