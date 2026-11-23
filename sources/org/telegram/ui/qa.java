package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
