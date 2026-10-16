package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class mn extends org.telegram.ui.zu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ io c;

    public mn(io ioVar, int i10) {
        this.c = ioVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void D() {
        if (this.a) {
            this.c.e0(this.b);
        }
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void J() {
        this.c.h0(this.b, null);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean z() {
        return false;
    }
}
