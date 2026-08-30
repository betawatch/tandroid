package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mn0 extends mg.o0 {
    public final /* synthetic */ nn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn0(nn0 nn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.h0 = nn0Var;
    }

    @Override // mg.o0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // mg.o0
    public final boolean i() {
        return !e();
    }

    @Override // mg.o0
    public final int j() {
        return 18;
    }

    @Override // mg.o0
    public final void s(float f10) {
        int i10 = this.i;
        nn0 nn0Var = this.h0;
        this.N = i0.a.d(f10, i10, org.telegram.ui.ActionBar.j6.v0(nn0Var.e ? org.telegram.ui.ActionBar.j6.Fj : org.telegram.ui.ActionBar.j6.va, nn0Var.s.c));
        int d = i0.a.d(f10, this.g, nn0Var.e ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, nn0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        this.P = i0.a.d(f10, this.h, nn0Var.e ? 1526726655 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wa, nn0Var.s.c));
    }
}
