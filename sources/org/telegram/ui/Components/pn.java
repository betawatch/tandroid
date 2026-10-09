package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pn extends org.telegram.ui.uu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ lo c;

    public pn(lo loVar, int i10) {
        this.c = loVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void D() {
        if (this.a) {
            this.c.e0(this.b);
        }
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void I() {
        this.c.h0(this.b, null);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean z() {
        return false;
    }
}
