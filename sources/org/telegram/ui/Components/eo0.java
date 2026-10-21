package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class eo0 extends ah.g1 {
    public final /* synthetic */ fo0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(fo0 fo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.h0 = fo0Var;
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
        fo0 fo0Var = this.h0;
        this.N = i0.a.f(f7, i10, org.telegram.ui.ActionBar.h6.w0(fo0Var.e ? org.telegram.ui.ActionBar.h6.Fj : org.telegram.ui.ActionBar.h6.va, fo0Var.s.c));
        int f10 = i0.a.f(f7, this.g, fo0Var.e ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Cj, fo0Var.s.c) : 0);
        this.O = f10;
        this.N = org.telegram.ui.ActionBar.h6.v(f10, this.N);
        this.P = i0.a.f(f7, this.h, fo0Var.e ? 1526726655 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.wa, fo0Var.s.c));
    }
}
