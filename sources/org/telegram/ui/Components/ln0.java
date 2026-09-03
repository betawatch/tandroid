package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ln0 extends mg.o0 {
    public final /* synthetic */ mn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln0(mn0 mn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.h0 = mn0Var;
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
        mn0 mn0Var = this.h0;
        this.N = i0.a.d(f10, i10, org.telegram.ui.ActionBar.j6.v0(mn0Var.e ? org.telegram.ui.ActionBar.j6.Fj : org.telegram.ui.ActionBar.j6.va, mn0Var.s.c));
        int d = i0.a.d(f10, this.g, mn0Var.e ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, mn0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        this.P = i0.a.d(f10, this.h, mn0Var.e ? 1526726655 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wa, mn0Var.s.c));
    }
}
