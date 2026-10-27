package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xo0 extends ig.i0 {
    public final /* synthetic */ org.telegram.ui.ey I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.mx K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo0(org.telegram.ui.mx mxVar, Context context, org.telegram.ui.ey eyVar, int i10, int i11, s4.l lVar, boolean z10, org.telegram.ui.ey eyVar2, Context context2) {
        super(context, eyVar, i10, i11, lVar, z10);
        this.K0 = mxVar;
        this.I0 = eyVar2;
        this.J0 = context2;
    }

    @Override // s4.h0
    public final void l() {
        bi.r1 r1Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.mx mxVar = this.K0;
        if (!mxVar.K0 && (r1Var = mxVar.a0) != null) {
            r1Var.v0(0);
            mxVar.K0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        mxVar.b0.e(false, false);
    }
}
