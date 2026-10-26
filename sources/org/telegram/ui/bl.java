package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl b;

    public /* synthetic */ bl(cl clVar, int i10) {
        this.a = i10;
        this.b = clVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hk hkVar = this.b.H.Y;
                if (hkVar != null) {
                    hkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = hkVar.U0;
                    if (dgVar != null) {
                        dgVar.u(false);
                        break;
                    }
                }
                break;
            default:
                hk hkVar2 = this.b.H.Y;
                if (hkVar2 != null) {
                    hkVar2.F0();
                    break;
                }
                break;
        }
    }
}
