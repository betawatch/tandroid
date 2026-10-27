package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class no0 extends bh.v0 {
    public final /* synthetic */ oo0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(oo0 oo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.u6 u6Var) {
        super(null, i10, view, tL_reactionCount, false, true, u6Var);
        this.h0 = oo0Var;
    }

    @Override // bh.v0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // bh.v0
    public final boolean i() {
        return !e();
    }

    @Override // bh.v0
    public final int j() {
        return 18;
    }

    @Override // bh.v0
    public final void s(float f7) {
        int i10 = this.i;
        oo0 oo0Var = this.h0;
        this.N = i0.a.f(f7, i10, org.telegram.ui.ActionBar.y6.w0(oo0Var.e ? org.telegram.ui.ActionBar.y6.Fj : org.telegram.ui.ActionBar.y6.va, oo0Var.s.c));
        int f10 = i0.a.f(f7, this.g, oo0Var.e ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Cj, oo0Var.s.c) : 0);
        this.O = f10;
        this.N = org.telegram.ui.ActionBar.y6.v(f10, this.N);
        this.P = i0.a.f(f7, this.h, oo0Var.e ? 1526726655 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.wa, oo0Var.s.c));
    }
}
