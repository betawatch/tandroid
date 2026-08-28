package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qm0 extends hg.p0 {
    public final /* synthetic */ rm0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm0(rm0 rm0Var, int i9, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.b6 b6Var) {
        super(null, i9, view, tL_reactionCount, false, true, b6Var);
        this.h0 = rm0Var;
    }

    @Override // hg.p0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // hg.p0
    public final boolean i() {
        return !e();
    }

    @Override // hg.p0
    public final int j() {
        return 18;
    }

    @Override // hg.p0
    public final void s(float f10) {
        int i9 = this.i;
        rm0 rm0Var = this.h0;
        this.N = i0.a.d(f10, i9, org.telegram.ui.ActionBar.f6.v0(rm0Var.e ? org.telegram.ui.ActionBar.f6.Fj : org.telegram.ui.ActionBar.f6.va, rm0Var.s.c));
        int d = i0.a.d(f10, this.g, rm0Var.e ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Cj, rm0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.f6.v(d, this.N);
        this.P = i0.a.d(f10, this.h, rm0Var.e ? 1526726655 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wa, rm0Var.s.c));
    }
}
