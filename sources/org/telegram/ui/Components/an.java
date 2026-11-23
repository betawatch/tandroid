package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class an extends org.telegram.ui.oq0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tn c;

    public an(tn tnVar, int i7) {
        this.c = tnVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void D() {
        if (this.a) {
            this.c.g0(this.b);
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void J() {
        this.c.j0(this.b, null);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean z() {
        return false;
    }
}
