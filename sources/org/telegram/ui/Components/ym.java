package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
