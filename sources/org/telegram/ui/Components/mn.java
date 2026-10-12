package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class mn extends org.telegram.ui.av0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ io c;

    public mn(io ioVar, int i10) {
        this.c = ioVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void D() {
        if (this.a) {
            this.c.e0(this.b);
        }
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void I() {
        this.c.h0(this.b, null);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean z() {
        return false;
    }
}
