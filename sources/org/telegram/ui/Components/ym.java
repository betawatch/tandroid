package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ym extends org.telegram.ui.au0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ sn c;

    public ym(sn snVar, int i10) {
        this.c = snVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean z() {
        return false;
    }
}
