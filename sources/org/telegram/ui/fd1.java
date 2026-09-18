package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class fd1 implements md1 {
    public boolean a;
    public final /* synthetic */ zn b;

    public fd1(zn znVar, boolean z10) {
        this.b = znVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.md1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.md1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.md1
    public final void o1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        xn xnVar = this.b.ea;
        xnVar.i(xnVar.f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
