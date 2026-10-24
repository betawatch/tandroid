package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class al implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;

    public /* synthetic */ al(bl blVar, int i10) {
        this.a = i10;
        this.b = blVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gk gkVar = this.b.H.Y;
                if (gkVar != null) {
                    gkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = gkVar.U0;
                    if (dgVar != null) {
                        dgVar.v(false);
                        break;
                    }
                }
                break;
            default:
                gk gkVar2 = this.b.H.Y;
                if (gkVar2 != null) {
                    gkVar2.F0();
                    break;
                }
                break;
        }
    }
}
