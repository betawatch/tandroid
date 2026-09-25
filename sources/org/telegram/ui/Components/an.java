package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
