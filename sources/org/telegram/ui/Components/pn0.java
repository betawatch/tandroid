package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pn0 extends yg.n0 {
    public final /* synthetic */ qn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn0(qn0 qn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.h0 = qn0Var;
    }

    @Override // yg.n0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // yg.n0
    public final boolean i() {
        return !e();
    }

    @Override // yg.n0
    public final int j() {
        return 18;
    }

    @Override // yg.n0
    public final void s(float f7) {
        int i10 = this.i;
        qn0 qn0Var = this.h0;
        this.N = i0.a.d(f7, i10, org.telegram.ui.ActionBar.j6.v0(qn0Var.e ? org.telegram.ui.ActionBar.j6.Fj : org.telegram.ui.ActionBar.j6.va, qn0Var.s.c));
        int d = i0.a.d(f7, this.g, qn0Var.e ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, qn0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        this.P = i0.a.d(f7, this.h, qn0Var.e ? 1526726655 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wa, qn0Var.s.c));
    }
}
