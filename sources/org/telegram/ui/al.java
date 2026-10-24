package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
