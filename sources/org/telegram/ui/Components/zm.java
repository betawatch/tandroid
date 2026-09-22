package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
