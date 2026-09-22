package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zm extends org.telegram.ui.tu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ un c;

    public zm(un unVar, int i10) {
        this.c = unVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean z() {
        return false;
    }
}
