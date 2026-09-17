package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class fn0 extends ah.h1 {
    public final /* synthetic */ gn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn0(gn0 gn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.h0 = gn0Var;
    }

    @Override // ah.h1
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // ah.h1
    public final boolean i() {
        return !e();
    }

    @Override // ah.h1
    public final int j() {
        return 18;
    }

    @Override // ah.h1
    public final void s(float f7) {
        int i10 = this.i;
        gn0 gn0Var = this.h0;
        this.N = i0.a.d(f7, i10, org.telegram.ui.ActionBar.j6.v0(gn0Var.e ? org.telegram.ui.ActionBar.j6.Fj : org.telegram.ui.ActionBar.j6.va, gn0Var.s.c));
        int d = i0.a.d(f7, this.g, gn0Var.e ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, gn0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        this.P = i0.a.d(f7, this.h, gn0Var.e ? 1526726655 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wa, gn0Var.s.c));
    }
}
