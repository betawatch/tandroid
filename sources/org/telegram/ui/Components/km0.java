package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class km0 extends jg.h0 {
    public final /* synthetic */ org.telegram.ui.cx J0;
    public final /* synthetic */ Context K0;
    public final /* synthetic */ org.telegram.ui.kw L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km0(org.telegram.ui.kw kwVar, Context context, org.telegram.ui.cx cxVar, int i7, int i10, v4.k kVar, boolean z10, org.telegram.ui.cx cxVar2, Context context2) {
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
