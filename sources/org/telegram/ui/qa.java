package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb b;

    public /* synthetic */ qa(mb mbVar, int i7) {
        this.a = i7;
        this.b = mbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mb mbVar = this.b;
                mbVar.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                mbVar.H0 = -1;
                mbVar.i1();
                mbVar.I0 = null;
                break;
            case 1:
                mb mbVar2 = this.b;
                mbVar2.b1(false);
                mbVar2.E.f();
                break;
            default:
                this.b.a1();
                break;
        }
    }
}
