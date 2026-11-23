package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;

    public /* synthetic */ qa(lb lbVar, int i7) {
        this.a = i7;
        this.b = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lb lbVar = this.b;
                lbVar.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                lbVar.I0 = -1;
                lbVar.i1();
                lbVar.J0 = null;
                break;
            case 1:
                lb lbVar2 = this.b;
                lbVar2.b1(false);
                lbVar2.F.f();
                break;
            default:
                this.b.a1();
                break;
        }
    }
}
