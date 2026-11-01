package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qm0 extends sg.m0 {
    public final /* synthetic */ rm0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm0(rm0 rm0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null, i10, view, tL_reactionCount, true, p6Var);
        this.g0 = rm0Var;
    }

    @Override // sg.m0
    public final boolean e() {
        return this.v > 0 || this.t || this.E.l != 1.0f;
    }

    @Override // sg.m0
    public final boolean h() {
        return !e();
    }

    @Override // sg.m0
    public final int i() {
        return 18;
    }

    @Override // sg.m0
    public final void r(float f7) {
        int i10 = this.h;
        rm0 rm0Var = this.g0;
        this.M = i0.b.f(f7, i10, org.telegram.ui.ActionBar.t6.w0(rm0Var.e ? org.telegram.ui.ActionBar.t6.tk : org.telegram.ui.ActionBar.t6.jb, rm0Var.s.c));
        int f10 = i0.b.f(f7, this.f, rm0Var.e ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.qk, rm0Var.s.c) : 0);
        this.N = f10;
        this.M = org.telegram.ui.ActionBar.t6.w(f10, this.M);
        this.O = i0.b.f(f7, this.g, rm0Var.e ? 1526726655 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.kb, rm0Var.s.c));
    }
}
