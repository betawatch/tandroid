package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class am0 extends ch.n0 {
    public final /* synthetic */ bm0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(bm0 bm0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null, i7, view, tL_reactionCount, true, i6Var);
        this.g0 = bm0Var;
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
        bm0 bm0Var = this.g0;
        this.M = i0.a.f(f10, i7, org.telegram.ui.ActionBar.n6.w0(bm0Var.e ? org.telegram.ui.ActionBar.n6.wk : org.telegram.ui.ActionBar.n6.mb, bm0Var.s.c));
        int f11 = i0.a.f(f10, this.f, bm0Var.e ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.tk, bm0Var.s.c) : 0);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.n6.w(f11, this.M);
        this.O = i0.a.f(f10, this.g, bm0Var.e ? 1526726655 : org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.nb, bm0Var.s.c));
    }
}
