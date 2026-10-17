package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class oo0 extends hg.h0 {
    public final /* synthetic */ org.telegram.ui.ey I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.nx K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0(org.telegram.ui.nx nxVar, Context context, org.telegram.ui.ey eyVar, int i10, int i11, s4.k kVar, boolean z10, org.telegram.ui.ey eyVar2, Context context2) {
        super(context, eyVar, i10, i11, kVar, z10);
        this.K0 = nxVar;
        this.I0 = eyVar2;
        this.J0 = context2;
    }

    @Override // s4.g0
    public final void l() {
        ai.u1 u1Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.nx nxVar = this.K0;
        if (!nxVar.I0 && (u1Var = nxVar.V) != null) {
            u1Var.u0(0);
            nxVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        nxVar.W.e(false, false);
    }
}
