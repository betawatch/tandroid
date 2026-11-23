package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mk b;

    public /* synthetic */ lk(mk mkVar, int i7) {
        this.a = i7;
        this.b = mkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rj rjVar = this.b.I.a0;
                if (rjVar != null) {
                    rjVar.j1();
                    break;
                }
                break;
            default:
                rj rjVar2 = this.b.I.a0;
                if (rjVar2 != null) {
                    rjVar2.U0 = false;
                    org.telegram.ui.Components.eg egVar = rjVar2.V0;
                    if (egVar != null) {
                        egVar.u(false);
                        break;
                    }
                }
                break;
        }
    }
}
