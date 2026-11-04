package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb b;

    public /* synthetic */ pa(kb kbVar, int i3) {
        this.a = i3;
        this.b = kbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kb kbVar = this.b;
                kbVar.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                kbVar.I0 = -1;
                kbVar.i1();
                kbVar.J0 = null;
                break;
            case 1:
                kb kbVar2 = this.b;
                kbVar2.b1(false);
                kbVar2.F.f();
                break;
            default:
                this.b.a1();
                break;
        }
    }
}
