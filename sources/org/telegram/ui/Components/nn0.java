package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nn0 extends ng.o0 {
    public final /* synthetic */ on0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn0(on0 on0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, i10, view, tL_reactionCount, false, true, g6Var);
        this.h0 = on0Var;
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
        on0 on0Var = this.h0;
        this.N = i0.a.d(f10, i10, org.telegram.ui.ActionBar.k6.v0(on0Var.e ? org.telegram.ui.ActionBar.k6.Fj : org.telegram.ui.ActionBar.k6.va, on0Var.s.c));
        int d = i0.a.d(f10, this.g, on0Var.e ? org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Cj, on0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.k6.v(d, this.N);
        this.P = i0.a.d(f10, this.h, on0Var.e ? 1526726655 : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.wa, on0Var.s.c));
    }
}
