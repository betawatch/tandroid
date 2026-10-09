package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lo0 extends zg.l0 {
    public final /* synthetic */ mo0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(mo0 mo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, i10, view, tL_reactionCount, false, true, e6Var);
        this.h0 = mo0Var;
    }

    @Override // zg.l0
    public final boolean e() {
        return this.w > 0 || this.u || this.F.l != 1.0f;
    }

    @Override // zg.l0
    public final boolean i() {
        return !e();
    }

    @Override // zg.l0
    public final int j() {
        return 18;
    }

    @Override // zg.l0
    public final void s(float f7) {
        int i10 = this.i;
        mo0 mo0Var = this.h0;
        this.N = i0.a.d(f7, i10, org.telegram.ui.ActionBar.i6.w0(mo0Var.e ? org.telegram.ui.ActionBar.i6.Fj : org.telegram.ui.ActionBar.i6.va, mo0Var.s.c));
        int d = i0.a.d(f7, this.g, mo0Var.e ? org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Cj, mo0Var.s.c) : 0);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.i6.v(d, this.N);
        this.P = i0.a.d(f7, this.h, mo0Var.e ? 1526726655 : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.wa, mo0Var.s.c));
    }
}
