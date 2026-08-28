package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pm extends org.telegram.ui.rt0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jn c;

    public pm(jn jnVar, int i9) {
        this.c = jnVar;
        this.b = i9;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void D() {
        if (this.a) {
            this.c.a0(this.b);
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void I() {
        this.c.d0(this.b, null);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean z() {
        return false;
    }
}
