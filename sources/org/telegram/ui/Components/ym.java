package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class ym extends org.telegram.ui.su0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tn c;

    public ym(tn tnVar, int i10) {
        this.c = tnVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean z() {
        return false;
    }
}
