package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ao0 extends fg.h0 {
    public final /* synthetic */ org.telegram.ui.wy I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.gy K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(org.telegram.ui.gy gyVar, Context context, org.telegram.ui.wy wyVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.wy wyVar2, Context context2) {
        super(context, wyVar, i10, i11, jVar, z10);
        this.K0 = gyVar;
        this.I0 = wyVar2;
        this.J0 = context2;
    }

    @Override // s4.h0
    public final void l() {
        bi.y1 y1Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.gy gyVar = this.K0;
        if (!gyVar.I0 && (y1Var = gyVar.V) != null) {
            y1Var.u0(0);
            gyVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        gyVar.W.e(false, false);
    }
}
