package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
