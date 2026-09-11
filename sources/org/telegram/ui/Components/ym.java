package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ym extends org.telegram.ui.su0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tn c;

    public ym(tn tnVar, int i10) {
        this.c = tnVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean z() {
        return false;
    }
}
