package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class oc1 implements vc1 {
    public boolean a;
    public final /* synthetic */ xn b;

    public oc1(xn xnVar, boolean z4) {
        this.b = xnVar;
        this.a = z4;
    }

    @Override // org.telegram.ui.vc1
    public final boolean T0() {
        return true;
    }

    @Override // org.telegram.ui.vc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.vc1
    public final void l1(boolean z4) {
        boolean z10 = !this.a;
        this.a = z10;
        vn vnVar = this.b.ba;
        vnVar.i(vnVar.f, vnVar.h, z4, Boolean.valueOf(z10), false);
    }
}
