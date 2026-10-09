package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wo0 extends gg.h0 {
    public final /* synthetic */ org.telegram.ui.ty I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.dy K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(org.telegram.ui.dy dyVar, Context context, org.telegram.ui.ty tyVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.ty tyVar2, Context context2) {
        super(context, tyVar, i10, i11, jVar, z10);
        this.K0 = dyVar;
        this.I0 = tyVar2;
        this.J0 = context2;
    }

    @Override // s4.i0
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.dy dyVar = this.K0;
        if (!dyVar.I0 && (w0Var = dyVar.V) != null) {
            w0Var.u0(0);
            dyVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        dyVar.W.e(false, false);
    }
}
