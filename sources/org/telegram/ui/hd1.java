package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class hd1 implements od1 {
    public boolean a;
    public final /* synthetic */ zn b;

    public hd1(zn znVar, boolean z10) {
        this.b = znVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.od1
    public final boolean V0() {
        return true;
    }

    @Override // org.telegram.ui.od1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.od1
    public final void o1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        xn xnVar = this.b.ea;
        xnVar.i(xnVar.f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
