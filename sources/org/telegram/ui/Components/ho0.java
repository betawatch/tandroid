package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ho0 extends ah.g1 {
    public final /* synthetic */ io0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho0(io0 io0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, i10, view, tL_reactionCount, false, true, g6Var);
        this.h0 = io0Var;
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
        io0 io0Var = this.h0;
        this.N = i0.a.f(f7, i10, org.telegram.ui.ActionBar.k6.w0(io0Var.e ? org.telegram.ui.ActionBar.k6.Fj : org.telegram.ui.ActionBar.k6.va, io0Var.s.c));
        int f10 = i0.a.f(f7, this.g, io0Var.e ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, io0Var.s.c) : 0);
        this.O = f10;
        this.N = org.telegram.ui.ActionBar.k6.v(f10, this.N);
        this.P = i0.a.f(f7, this.h, io0Var.e ? 1526726655 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wa, io0Var.s.c));
    }
}
