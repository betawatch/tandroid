package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hu0 extends xv0 {
    public final /* synthetic */ aw0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu0(aw0 aw0Var, Context context) {
        super(aw0Var, context, 0, false);
        this.G = aw0Var;
    }

    @Override // org.telegram.ui.Components.xv0, s4.h0
    public final void l() {
        super.l();
        aw0 aw0Var = this.G;
        tu0 d02 = aw0Var.d0(8);
        if (d02 != null && d02.n.getVisibility() == 0) {
            aw0Var.f0.l();
        }
        if (d02 != null) {
            ot0 ot0Var = d02.v;
            di.z6 z6Var = this.s;
            ot0Var.e(z6Var != null && (z6Var.k() || (aw0Var.q0() && this.s.g() > 0)), true);
        }
    }
}
