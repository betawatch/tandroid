package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class sn0 extends zg.m0 {
    public final /* synthetic */ tn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(tn0 tn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.h0 = tn0Var;
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
        tn0 tn0Var = this.h0;
        this.N = i0.a.d(f7, i10, org.telegram.ui.ActionBar.h6.v0(tn0Var.e ? org.telegram.ui.ActionBar.h6.Fj : org.telegram.ui.ActionBar.h6.va, tn0Var.s.c));
        int d = i0.a.d(f7, this.g, tn0Var.e ? org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Cj, tn0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.h6.v(d, this.N);
        this.P = i0.a.d(f7, this.h, tn0Var.e ? 1526726655 : org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.wa, tn0Var.s.c));
    }
}
