package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mc1 implements tc1 {
    public boolean a;
    public final /* synthetic */ xn b;

    public mc1(xn xnVar, boolean z4) {
        this.b = xnVar;
        this.a = z4;
    }

    @Override // org.telegram.ui.tc1
    public final boolean V0() {
        return true;
    }

    @Override // org.telegram.ui.tc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.tc1
    public final void n1(boolean z4) {
        boolean z10 = !this.a;
        this.a = z10;
        vn vnVar = this.b.ba;
        vnVar.i(vnVar.f, vnVar.h, z4, Boolean.valueOf(z10), false);
    }
}
