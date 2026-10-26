package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wo0 extends ig.i0 {
    public final /* synthetic */ org.telegram.ui.cy I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.jx K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(org.telegram.ui.jx jxVar, Context context, org.telegram.ui.cy cyVar, int i10, int i11, s4.l lVar, boolean z10, org.telegram.ui.cy cyVar2, Context context2) {
        super(context, cyVar, i10, i11, lVar, z10);
        this.K0 = jxVar;
        this.I0 = cyVar2;
        this.J0 = context2;
    }

    @Override // s4.h0
    public final void l() {
        bi.r1 r1Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.jx jxVar = this.K0;
        if (!jxVar.K0 && (r1Var = jxVar.a0) != null) {
            r1Var.v0(0);
            jxVar.K0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        jxVar.b0.e(false, false);
    }
}
