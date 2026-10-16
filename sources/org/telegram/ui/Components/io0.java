package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class io0 extends ah.g1 {
    public final /* synthetic */ jo0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(jo0 jo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, i10, view, tL_reactionCount, false, true, c6Var);
        this.h0 = jo0Var;
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
        jo0 jo0Var = this.h0;
        this.N = i0.a.d(f7, i10, org.telegram.ui.ActionBar.g6.w0(jo0Var.e ? org.telegram.ui.ActionBar.g6.Fj : org.telegram.ui.ActionBar.g6.va, jo0Var.s.c));
        int d = i0.a.d(f7, this.g, jo0Var.e ? org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Cj, jo0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.g6.v(d, this.N);
        this.P = i0.a.d(f7, this.h, jo0Var.e ? 1526726655 : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.wa, jo0Var.s.c));
    }
}
