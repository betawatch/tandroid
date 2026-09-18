package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ il b;

    public /* synthetic */ hl(il ilVar, int i10) {
        this.a = i10;
        this.b = ilVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nk nkVar = this.b.H.Y;
                if (nkVar != null) {
                    nkVar.T0 = false;
                    org.telegram.ui.Components.cg cgVar = nkVar.U0;
                    if (cgVar != null) {
                        cgVar.u(false);
                        break;
                    }
                }
                break;
            default:
                nk nkVar2 = this.b.H.Y;
                if (nkVar2 != null) {
                    nkVar2.I0();
                    break;
                }
                break;
        }
    }
}
