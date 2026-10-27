package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class us0 extends yv0 {
    public final /* synthetic */ bw0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(bw0 bw0Var, Context context) {
        super(bw0Var, context, 0, true);
        this.G = bw0Var;
    }

    @Override // org.telegram.ui.Components.yv0, s4.h0
    public final void l() {
        super.l();
        bw0 bw0Var = this.G;
        uu0 d02 = bw0Var.d0(9);
        if (d02 != null && d02.n.getVisibility() == 0) {
            bw0Var.h0.l();
        }
        if (d02 != null) {
            pt0 pt0Var = d02.v;
            di.z6 z6Var = this.s;
            pt0Var.e(z6Var != null && (z6Var.k() || (bw0Var.q0() && this.s.g() > 0)), true);
        }
    }
}
