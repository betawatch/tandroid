package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
