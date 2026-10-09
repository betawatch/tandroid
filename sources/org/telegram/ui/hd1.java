package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hd1 implements od1 {
    public boolean a;
    public final /* synthetic */ zn b;

    public hd1(zn znVar, boolean z10) {
        this.b = znVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.od1
    public final boolean T0() {
        return true;
    }

    @Override // org.telegram.ui.od1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.od1
    public final void l1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        xn xnVar = this.b.ea;
        xnVar.i(xnVar.f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
