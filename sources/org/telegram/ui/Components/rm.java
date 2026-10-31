package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rm extends org.telegram.ui.yr0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jn c;

    public rm(jn jnVar, int i10) {
        this.c = jnVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void D() {
        if (this.a) {
            this.c.e0(this.b);
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void J() {
        this.c.h0(this.b, null);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean z() {
        return false;
    }
}
