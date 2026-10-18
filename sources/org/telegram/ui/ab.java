package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
