package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
