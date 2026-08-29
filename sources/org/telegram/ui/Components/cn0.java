package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cn0 extends kg.o0 {
    public final /* synthetic */ dn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(dn0 dn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, i10, view, tL_reactionCount, false, true, c6Var);
        this.h0 = dn0Var;
    }

    @Override // kg.o0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // kg.o0
    public final boolean i() {
        return !e();
    }

    @Override // kg.o0
    public final int j() {
        return 18;
    }

    @Override // kg.o0
    public final void s(float f9) {
        int i10 = this.i;
        dn0 dn0Var = this.h0;
        this.N = i0.a.d(f9, i10, org.telegram.ui.ActionBar.g6.v0(dn0Var.e ? org.telegram.ui.ActionBar.g6.Fj : org.telegram.ui.ActionBar.g6.va, dn0Var.s.c));
        int d = i0.a.d(f9, this.g, dn0Var.e ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Cj, dn0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.g6.v(d, this.N);
        this.P = i0.a.d(f9, this.h, dn0Var.e ? 1526726655 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wa, dn0Var.s.c));
    }
}
