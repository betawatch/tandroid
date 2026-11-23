package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class cm0 extends ch.n0 {
    public final /* synthetic */ dm0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm0(dm0 dm0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null, i7, view, tL_reactionCount, true, h6Var);
        this.g0 = dm0Var;
    }

    @Override // ch.n0
    public final boolean e() {
        return this.v > 0 || this.t || this.E.l != 1.0f;
    }

    @Override // ch.n0
    public final boolean h() {
        return !e();
    }

    @Override // ch.n0
    public final int i() {
        return 18;
    }

    @Override // ch.n0
    public final void r(float f10) {
        int i7 = this.h;
        dm0 dm0Var = this.g0;
        this.M = i0.a.f(f10, i7, org.telegram.ui.ActionBar.m6.w0(dm0Var.e ? org.telegram.ui.ActionBar.m6.wk : org.telegram.ui.ActionBar.m6.mb, dm0Var.s.c));
        int f11 = i0.a.f(f10, this.f, dm0Var.e ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tk, dm0Var.s.c) : 0);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.m6.w(f11, this.M);
        this.O = i0.a.f(f10, this.g, dm0Var.e ? 1526726655 : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.nb, dm0Var.s.c));
    }
}
