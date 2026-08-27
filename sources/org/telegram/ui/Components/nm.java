package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nm extends org.telegram.ui.st0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ in c;

    public nm(in inVar, int i10) {
        this.c = inVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean z() {
        return false;
    }
}
