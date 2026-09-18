package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hn0 extends zg.n0 {
    public final /* synthetic */ in0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn0(in0 in0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.h0 = in0Var;
    }

    @Override // zg.n0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // zg.n0
    public final boolean i() {
        return !e();
    }

    @Override // zg.n0
    public final int j() {
        return 18;
    }

    @Override // zg.n0
    public final void s(float f7) {
        int i10 = this.i;
        in0 in0Var = this.h0;
        this.N = i0.a.d(f7, i10, org.telegram.ui.ActionBar.j6.v0(in0Var.e ? org.telegram.ui.ActionBar.j6.Fj : org.telegram.ui.ActionBar.j6.va, in0Var.s.c));
        int d = i0.a.d(f7, this.g, in0Var.e ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, in0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        this.P = i0.a.d(f7, this.h, in0Var.e ? 1526726655 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wa, in0Var.s.c));
    }
}
