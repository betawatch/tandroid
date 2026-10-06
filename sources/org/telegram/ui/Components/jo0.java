package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        if (!dyVar.K0 && (w0Var = dyVar.a0) != null) {
            w0Var.v0(0);
            dyVar.K0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        dyVar.b0.e(false, false);
    }
}
