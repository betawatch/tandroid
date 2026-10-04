package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class jo0 extends gg.i0 {
    public final /* synthetic */ org.telegram.ui.uy I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.dy K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo0(org.telegram.ui.dy dyVar, Context context, org.telegram.ui.uy uyVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.uy uyVar2, Context context2) {
        super(context, uyVar, i10, i11, jVar, z10);
        this.K0 = dyVar;
        this.I0 = uyVar2;
        this.J0 = context2;
    }

    @Override // s4.h0
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.dy dyVar = this.K0;
        if (!dyVar.J0 && (w0Var = dyVar.W) != null) {
            w0Var.v0(0);
            dyVar.J0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        dyVar.a0.e(false, false);
    }
}
