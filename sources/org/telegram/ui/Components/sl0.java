package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sl0 extends ch.n0 {
    public final /* synthetic */ tl0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl0(tl0 tl0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, i7, view, tL_reactionCount, true, e6Var);
        this.g0 = tl0Var;
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
        tl0 tl0Var = this.g0;
        this.M = i0.a.f(f10, i7, org.telegram.ui.ActionBar.j6.w0(tl0Var.e ? org.telegram.ui.ActionBar.j6.wk : org.telegram.ui.ActionBar.j6.mb, tl0Var.s.c));
        int f11 = i0.a.f(f10, this.f, tl0Var.e ? org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.tk, tl0Var.s.c) : 0);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.j6.w(f11, this.M);
        this.O = i0.a.f(f10, this.g, tl0Var.e ? 1526726655 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.nb, tl0Var.s.c));
    }
}
