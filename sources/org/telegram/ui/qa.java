package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
