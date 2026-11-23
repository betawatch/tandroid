package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                    rjVar.i1();
                    break;
                }
                break;
            default:
                rj rjVar2 = this.b.I.a0;
                if (rjVar2 != null) {
                    rjVar2.U0 = false;
                    org.telegram.ui.Components.fg fgVar = rjVar2.V0;
                    if (fgVar != null) {
                        fgVar.u(false);
                        break;
                    }
                }
                break;
        }
    }
}
