package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class so0 extends hg.h0 {
    public final /* synthetic */ org.telegram.ui.yy I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.iy K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so0(org.telegram.ui.iy iyVar, Context context, org.telegram.ui.yy yyVar, int i10, int i11, s4.k kVar, boolean z10, org.telegram.ui.yy yyVar2, Context context2) {
        super(context, yyVar, i10, i11, kVar, z10);
        this.K0 = iyVar;
        this.I0 = yyVar2;
        this.J0 = context2;
    }

    @Override // s4.g0
    public final void l() {
        bi.o0 o0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.iy iyVar = this.K0;
        if (!iyVar.I0 && (o0Var = iyVar.V) != null) {
            o0Var.u0(0);
            iyVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        iyVar.W.e(false, false);
    }
}
