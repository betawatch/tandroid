package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class yl0 extends jg.h0 {
    public final /* synthetic */ org.telegram.ui.ww I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.fw K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl0(org.telegram.ui.fw fwVar, Context context, org.telegram.ui.ww wwVar, int i7, int i10, v4.k kVar, boolean z9, org.telegram.ui.ww wwVar2, Context context2) {
        super(context, wwVar, i7, i10, kVar, z9);
        this.K0 = fwVar;
        this.I0 = wwVar2;
        this.J0 = context2;
    }

    @Override // v4.g0
    public final void f() {
        bi.q1 q1Var;
        int i7 = this.B0;
        super.f();
        org.telegram.ui.fw fwVar = this.K0;
        if (!fwVar.K0 && (q1Var = fwVar.a0) != null) {
            q1Var.v0(0);
            fwVar.K0 = true;
        }
        if (b() != 0 || i7 == 0 || this.D0 > 0) {
            return;
        }
        fwVar.b0.e(false, false);
    }
}
