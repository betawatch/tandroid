package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mn0 extends ng.o0 {
    public final /* synthetic */ nn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn0(nn0 nn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, i10, view, tL_reactionCount, false, true, g6Var);
        this.h0 = nn0Var;
    }

    @Override // ng.o0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // ng.o0
    public final boolean i() {
        return !e();
    }

    @Override // ng.o0
    public final int j() {
        return 18;
    }

    @Override // ng.o0
    public final void s(float f10) {
        int i10 = this.i;
        nn0 nn0Var = this.h0;
        this.N = i0.a.d(f10, i10, org.telegram.ui.ActionBar.k6.v0(nn0Var.e ? org.telegram.ui.ActionBar.k6.Fj : org.telegram.ui.ActionBar.k6.va, nn0Var.s.c));
        int d = i0.a.d(f10, this.g, nn0Var.e ? org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Cj, nn0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.k6.v(d, this.N);
        this.P = i0.a.d(f10, this.h, nn0Var.e ? 1526726655 : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.wa, nn0Var.s.c));
    }
}
