package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yv0 extends xv0 {
    public final /* synthetic */ zv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv0(zv0 zv0Var, Context context, int i10) {
        super(zv0Var.e, context, i10, false);
        this.G = zv0Var;
    }

    @Override // org.telegram.ui.Components.xv0, s4.h0
    public final void l() {
        super.l();
        zv0 zv0Var = this.G;
        aw0 aw0Var = zv0Var.e;
        int i10 = zv0Var.a;
        int[] iArr = aw0.p2;
        tu0 d02 = aw0Var.d0(i10);
        if (d02 != null && d02.n.getVisibility() == 0) {
            zv0Var.d.l();
        }
        if (d02 != null) {
            ot0 ot0Var = d02.v;
            di.z6 z6Var = this.s;
            ot0Var.e(z6Var != null && (z6Var.k() || (aw0Var.q0() && this.s.g() > 0)), true);
        }
    }
}
