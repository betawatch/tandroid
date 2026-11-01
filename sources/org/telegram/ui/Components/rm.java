package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rm extends org.telegram.ui.xr0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jn c;

    public rm(jn jnVar, int i10) {
        this.c = jnVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void D() {
        if (this.a) {
            this.c.e0(this.b);
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void J() {
        this.c.h0(this.b, null);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean z() {
        return false;
    }
}
