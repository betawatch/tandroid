package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rn0 extends gg.i0 {
    public final /* synthetic */ org.telegram.ui.uy I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.ey K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn0(org.telegram.ui.ey eyVar, Context context, org.telegram.ui.uy uyVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.uy uyVar2, Context context2) {
        super(context, uyVar, i10, i11, jVar, z10);
        this.K0 = eyVar;
        this.I0 = uyVar2;
        this.J0 = context2;
    }

    @Override // s4.h0
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.ey eyVar = this.K0;
        if (!eyVar.I0 && (w0Var = eyVar.V) != null) {
            w0Var.u0(0);
            eyVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        eyVar.W.e(false, false);
    }
}
