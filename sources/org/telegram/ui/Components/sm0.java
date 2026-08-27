package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sm0 extends ig.o0 {
    public final /* synthetic */ tm0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm0(tm0 tm0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, i10, view, tL_reactionCount, false, true, c6Var);
        this.h0 = tm0Var;
    }

    @Override // ig.o0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // ig.o0
    public final boolean i() {
        return !e();
    }

    @Override // ig.o0
    public final int j() {
        return 18;
    }

    @Override // ig.o0
    public final void s(float f10) {
        int i10 = this.i;
        tm0 tm0Var = this.h0;
        this.N = i0.b.d(f10, i10, org.telegram.ui.ActionBar.g6.v0(tm0Var.e ? org.telegram.ui.ActionBar.g6.Fj : org.telegram.ui.ActionBar.g6.va, tm0Var.s.c));
        int d = i0.b.d(f10, this.g, tm0Var.e ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Cj, tm0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.g6.v(d, this.N);
        this.P = i0.b.d(f10, this.h, tm0Var.e ? 1526726655 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wa, tm0Var.s.c));
    }
}
