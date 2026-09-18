package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class el implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl b;

    public /* synthetic */ el(fl flVar, int i10) {
        this.a = i10;
        this.b = flVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lk lkVar = this.b.H.Y;
                if (lkVar != null) {
                    lkVar.H0();
                    break;
                }
                break;
            default:
                lk lkVar2 = this.b.H.Y;
                if (lkVar2 != null) {
                    lkVar2.T0 = false;
                    org.telegram.ui.Components.dg dgVar = lkVar2.U0;
                    if (dgVar != null) {
                        dgVar.u(false);
                        break;
                    }
                }
                break;
        }
    }
}
