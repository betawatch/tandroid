package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ol0 extends ch.m0 {
    public final /* synthetic */ pl0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol0(pl0 pl0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i7, view, tL_reactionCount, true, f6Var);
        this.g0 = pl0Var;
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
        pl0 pl0Var = this.g0;
        this.M = i0.a.f(f10, i7, org.telegram.ui.ActionBar.k6.w0(pl0Var.e ? org.telegram.ui.ActionBar.k6.tk : org.telegram.ui.ActionBar.k6.jb, pl0Var.s.c));
        int f11 = i0.a.f(f10, this.f, pl0Var.e ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.qk, pl0Var.s.c) : 0);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.k6.w(f11, this.M);
        this.O = i0.a.f(f10, this.g, pl0Var.e ? 1526726655 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kb, pl0Var.s.c));
    }
}
