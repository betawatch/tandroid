package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fn0 extends zg.n0 {
    public final /* synthetic */ gn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn0(gn0 gn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, i10, view, tL_reactionCount, false, true, e6Var);
        this.h0 = gn0Var;
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
        gn0 gn0Var = this.h0;
        this.N = i0.a.d(f7, i10, org.telegram.ui.ActionBar.i6.v0(gn0Var.e ? org.telegram.ui.ActionBar.i6.Fj : org.telegram.ui.ActionBar.i6.va, gn0Var.s.c));
        int d = i0.a.d(f7, this.g, gn0Var.e ? org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Cj, gn0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.i6.v(d, this.N);
        this.P = i0.a.d(f7, this.h, gn0Var.e ? 1526726655 : org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.wa, gn0Var.s.c));
    }
}
