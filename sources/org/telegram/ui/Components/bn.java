package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class bn extends org.telegram.ui.lu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wn c;

    public bn(wn wnVar, int i10) {
        this.c = wnVar;
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
