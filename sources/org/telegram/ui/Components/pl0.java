package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pl0 extends ch.m0 {
    public final /* synthetic */ ql0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(ql0 ql0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, i7, view, tL_reactionCount, true, g6Var);
        this.g0 = ql0Var;
    }

    @Override // ch.m0
    public final boolean e() {
        return this.v > 0 || this.t || this.E.l != 1.0f;
    }

    @Override // ch.m0
    public final boolean h() {
        return !e();
    }

    @Override // ch.m0
    public final int i() {
        return 18;
    }

    @Override // ch.m0
    public final void r(float f10) {
        int i7 = this.h;
        ql0 ql0Var = this.g0;
        this.M = i0.a.f(f10, i7, org.telegram.ui.ActionBar.l6.w0(ql0Var.e ? org.telegram.ui.ActionBar.l6.tk : org.telegram.ui.ActionBar.l6.jb, ql0Var.s.c));
        int f11 = i0.a.f(f10, this.f, ql0Var.e ? org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.qk, ql0Var.s.c) : 0);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.l6.w(f11, this.M);
        this.O = i0.a.f(f10, this.g, ql0Var.e ? 1526726655 : org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.kb, ql0Var.s.c));
    }
}
