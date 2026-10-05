package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class cn extends org.telegram.ui.ou0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xn c;

    public cn(xn xnVar, int i10) {
        this.c = xnVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean z() {
        return false;
    }
}
