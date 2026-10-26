package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mo0 extends bh.v0 {
    public final /* synthetic */ no0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(no0 no0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.u6 u6Var) {
        super(null, i10, view, tL_reactionCount, false, true, u6Var);
        this.h0 = no0Var;
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
        no0 no0Var = this.h0;
        this.N = i0.a.f(f7, i10, org.telegram.ui.ActionBar.y6.w0(no0Var.e ? org.telegram.ui.ActionBar.y6.Fj : org.telegram.ui.ActionBar.y6.va, no0Var.s.c));
        int f10 = i0.a.f(f7, this.g, no0Var.e ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Cj, no0Var.s.c) : 0);
        this.O = f10;
        this.N = org.telegram.ui.ActionBar.y6.v(f10, this.N);
        this.P = i0.a.f(f7, this.h, no0Var.e ? 1526726655 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.wa, no0Var.s.c));
    }
}
