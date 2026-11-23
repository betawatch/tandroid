package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class nm0 extends jg.h0 {
    public final /* synthetic */ org.telegram.ui.cx J0;
    public final /* synthetic */ Context K0;
    public final /* synthetic */ org.telegram.ui.kw L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm0(org.telegram.ui.kw kwVar, Context context, org.telegram.ui.cx cxVar, int i7, int i10, v4.k kVar, boolean z10, org.telegram.ui.cx cxVar2, Context context2) {
        super(context, cxVar, i7, i10, kVar, z10);
        this.L0 = kwVar;
        this.J0 = cxVar2;
        this.K0 = context2;
    }

    @Override // v4.i0
    public final void f() {
        di.b1 b1Var;
        int i7 = this.C0;
        super.f();
        org.telegram.ui.kw kwVar = this.L0;
        if (!kwVar.L0 && (b1Var = kwVar.b0) != null) {
            b1Var.v0(0);
            kwVar.L0 = true;
        }
        if (b() != 0 || i7 == 0 || this.E0 > 0) {
            return;
        }
        kwVar.c0.e(false, false);
    }
}
