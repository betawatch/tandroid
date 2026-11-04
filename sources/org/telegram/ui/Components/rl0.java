package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rl0 extends dh.l0 {
    public final /* synthetic */ sl0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl0(sl0 sl0Var, int i3, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, i3, view, tL_reactionCount, true, e6Var);
        this.g0 = sl0Var;
    }

    @Override // dh.l0
    public final boolean e() {
        return this.v > 0 || this.t || this.E.l != 1.0f;
    }

    @Override // dh.l0
    public final boolean h() {
        return !e();
    }

    @Override // dh.l0
    public final int i() {
        return 18;
    }

    @Override // dh.l0
    public final void r(float f10) {
        int i3 = this.h;
        sl0 sl0Var = this.g0;
        this.M = i0.a.f(f10, i3, org.telegram.ui.ActionBar.k6.w0(sl0Var.e ? org.telegram.ui.ActionBar.k6.tk : org.telegram.ui.ActionBar.k6.jb, sl0Var.s.c));
        int f11 = i0.a.f(f10, this.f, sl0Var.e ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.qk, sl0Var.s.c) : 0);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.k6.w(f11, this.M);
        this.O = i0.a.f(f10, this.g, sl0Var.e ? 1526726655 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kb, sl0Var.s.c));
    }
}
