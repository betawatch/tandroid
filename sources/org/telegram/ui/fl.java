package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl b;

    public /* synthetic */ fl(gl glVar, int i10) {
        this.a = i10;
        this.b = glVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mk mkVar = this.b.H.Y;
                if (mkVar != null) {
                    mkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = mkVar.U0;
                    if (dgVar != null) {
                        dgVar.u(false);
                        break;
                    }
                }
                break;
            default:
                mk mkVar2 = this.b.H.Y;
                if (mkVar2 != null) {
                    mkVar2.H0();
                    break;
                }
                break;
        }
    }
}
