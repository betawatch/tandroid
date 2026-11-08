package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
