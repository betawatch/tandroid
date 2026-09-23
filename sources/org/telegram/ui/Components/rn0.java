package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rn0 extends gg.i0 {
    public final /* synthetic */ org.telegram.ui.ry I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.ay K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn0(org.telegram.ui.ay ayVar, Context context, org.telegram.ui.ry ryVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.ry ryVar2, Context context2) {
        super(context, ryVar, i10, i11, jVar, z10);
        this.K0 = ayVar;
        this.I0 = ryVar2;
        this.J0 = context2;
    }

    @Override // s4.h0
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.ay ayVar = this.K0;
        if (!ayVar.I0 && (w0Var = ayVar.V) != null) {
            w0Var.u0(0);
            ayVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        ayVar.W.e(false, false);
    }
}
