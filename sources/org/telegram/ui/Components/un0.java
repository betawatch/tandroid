package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class un0 extends zg.m0 {
    public final /* synthetic */ vn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(vn0 vn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.h0 = vn0Var;
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
        vn0 vn0Var = this.h0;
        this.N = i0.a.d(f7, i10, org.telegram.ui.ActionBar.h6.v0(vn0Var.e ? org.telegram.ui.ActionBar.h6.Fj : org.telegram.ui.ActionBar.h6.va, vn0Var.s.c));
        int d = i0.a.d(f7, this.g, vn0Var.e ? org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Cj, vn0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.h6.v(d, this.N);
        this.P = i0.a.d(f7, this.h, vn0Var.e ? 1526726655 : org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.wa, vn0Var.s.c));
    }
}
