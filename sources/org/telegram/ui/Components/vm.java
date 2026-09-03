package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vm extends org.telegram.ui.fu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pn c;

    public vm(pn pnVar, int i10) {
        this.c = pnVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean z() {
        return false;
    }
}
