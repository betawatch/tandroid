package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class an extends org.telegram.ui.mu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vn c;

    public an(vn vnVar, int i10) {
        this.c = vnVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean z() {
        return false;
    }
}
