package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac b;

    public /* synthetic */ cb(ac acVar, int i10) {
        this.a = i10;
        this.b = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ac acVar = this.b;
                acVar.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                acVar.H0 = -1;
                acVar.d1();
                acVar.I0 = null;
                break;
            case 1:
                ac acVar2 = this.b;
                acVar2.W0(false);
                acVar2.E.l();
                break;
            default:
                this.b.V0();
                break;
        }
    }
}
