package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class an extends org.telegram.ui.lu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vn c;

    public an(vn vnVar, int i10) {
        this.c = vnVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean z() {
        return false;
    }
}
