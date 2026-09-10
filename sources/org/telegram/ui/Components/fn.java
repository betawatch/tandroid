package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fn extends org.telegram.ui.tu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zn c;

    public fn(zn znVar, int i10) {
        this.c = znVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean z() {
        return false;
    }
}
