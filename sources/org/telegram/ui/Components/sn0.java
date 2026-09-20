package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class sn0 extends zg.m0 {
    public final /* synthetic */ tn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(tn0 tn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.h0 = tn0Var;
    }

    @Override // zg.m0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // zg.m0
    public final boolean i() {
        return !e();
    }

    @Override // zg.m0
    public final int j() {
        return 18;
    }

    @Override // zg.m0
    public final void s(float f7) {
        int i10 = this.i;
        tn0 tn0Var = this.h0;
        this.N = i0.a.d(f7, i10, org.telegram.ui.ActionBar.j6.v0(tn0Var.e ? org.telegram.ui.ActionBar.j6.Fj : org.telegram.ui.ActionBar.j6.va, tn0Var.s.c));
        int d = i0.a.d(f7, this.g, tn0Var.e ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, tn0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        this.P = i0.a.d(f7, this.h, tn0Var.e ? 1526726655 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wa, tn0Var.s.c));
    }
}
