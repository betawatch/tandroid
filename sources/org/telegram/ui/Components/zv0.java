package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zv0 extends yv0 {
    public final /* synthetic */ aw0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv0(aw0 aw0Var, Context context, int i10) {
        super(aw0Var.e, context, i10, false);
        this.G = aw0Var;
    }

    @Override // org.telegram.ui.Components.yv0, s4.h0
    public final void l() {
        super.l();
        aw0 aw0Var = this.G;
        bw0 bw0Var = aw0Var.e;
        int i10 = aw0Var.a;
        int[] iArr = bw0.p2;
        uu0 d02 = bw0Var.d0(i10);
        if (d02 != null && d02.n.getVisibility() == 0) {
            aw0Var.d.l();
        }
        if (d02 != null) {
            pt0 pt0Var = d02.v;
            di.z6 z6Var = this.s;
            pt0Var.e(z6Var != null && (z6Var.k() || (bw0Var.q0() && this.s.g() > 0)), true);
        }
    }
}
