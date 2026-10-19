package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class do0 extends ah.g1 {
    public final /* synthetic */ eo0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do0(eo0 eo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.h0 = eo0Var;
    }

    @Override // ah.g1
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // ah.g1
    public final boolean i() {
        return !e();
    }

    @Override // ah.g1
    public final int j() {
        return 18;
    }

    @Override // ah.g1
    public final void s(float f7) {
        int i10 = this.i;
        eo0 eo0Var = this.h0;
        this.N = i0.a.f(f7, i10, org.telegram.ui.ActionBar.h6.w0(eo0Var.e ? org.telegram.ui.ActionBar.h6.Fj : org.telegram.ui.ActionBar.h6.va, eo0Var.s.c));
        int f10 = i0.a.f(f7, this.g, eo0Var.e ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Cj, eo0Var.s.c) : 0);
        this.O = f10;
        this.N = org.telegram.ui.ActionBar.h6.v(f10, this.N);
        this.P = i0.a.f(f7, this.h, eo0Var.e ? 1526726655 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.wa, eo0Var.s.c));
    }
}
