package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class hv0 extends gv0 {
    public final /* synthetic */ iv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(iv0 iv0Var, Context context, int i10) {
        super(iv0Var.e, context, i10, false);
        this.G = iv0Var;
    }

    @Override // org.telegram.ui.Components.gv0, s4.h0
    public final void l() {
        super.l();
        iv0 iv0Var = this.G;
        jv0 jv0Var = iv0Var.e;
        int i10 = iv0Var.a;
        int[] iArr = jv0.d2;
        cu0 W = jv0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            iv0Var.d.l();
        }
        if (W != null) {
            ts0 ts0Var = W.w;
            ai.d9 d9Var = this.s;
            ts0Var.e(d9Var != null && (d9Var.k() || (jv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
