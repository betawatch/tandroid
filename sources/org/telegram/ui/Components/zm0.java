package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zm0 extends zf.z {
    public final /* synthetic */ org.telegram.ui.ay I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.kx K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm0(org.telegram.ui.kx kxVar, Context context, org.telegram.ui.ay ayVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.ay ayVar2, Context context2) {
        super(context, ayVar, i10, i11, jVar, z10);
        this.K0 = kxVar;
        this.I0 = ayVar2;
        this.J0 = context2;
    }

    @Override // s4.g0
    public final void f() {
        ag.b1 b1Var;
        int i10 = this.B0;
        super.f();
        org.telegram.ui.kx kxVar = this.K0;
        if (!kxVar.K0 && (b1Var = kxVar.a0) != null) {
            b1Var.v0(0);
            kxVar.K0 = true;
        }
        if (b() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        kxVar.b0.e(false, false);
    }
}
