package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
