package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb b;

    public /* synthetic */ ab(xb xbVar, int i10) {
        this.a = i10;
        this.b = xbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xb xbVar = this.b;
                xbVar.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                xbVar.H0 = -1;
                xbVar.d1();
                xbVar.I0 = null;
                break;
            case 1:
                xb xbVar2 = this.b;
                xbVar2.W0(false);
                xbVar2.E.l();
                break;
            default:
                this.b.V0();
                break;
        }
    }
}
