package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zm extends org.telegram.ui.vu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ un c;

    public zm(un unVar, int i10) {
        this.c = unVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean z() {
        return false;
    }
}
