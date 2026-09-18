package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class tn0 extends zg.m0 {
    public final /* synthetic */ un0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn0(un0 un0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, i10, view, tL_reactionCount, false, true, e6Var);
        this.h0 = un0Var;
    }

    @Override // zg.m0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // zg.m0
    public final boolean i() {
        return !e();
    }

    @Override // zg.m0
    public final int j() {
        return 18;
    }

    @Override // zg.m0
    public final void s(float f7) {
        int i10 = this.i;
        un0 un0Var = this.h0;
        this.N = i0.a.d(f7, i10, org.telegram.ui.ActionBar.j6.v0(un0Var.e ? org.telegram.ui.ActionBar.j6.Fj : org.telegram.ui.ActionBar.j6.va, un0Var.s.c));
        int d = i0.a.d(f7, this.g, un0Var.e ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, un0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        this.P = i0.a.d(f7, this.h, un0Var.e ? 1526726655 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wa, un0Var.s.c));
    }
}
