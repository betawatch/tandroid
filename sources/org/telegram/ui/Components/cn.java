package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
