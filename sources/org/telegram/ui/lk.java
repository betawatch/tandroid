package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                    rjVar.e1();
                    break;
                }
                break;
            default:
                rj rjVar2 = this.b.I.a0;
                if (rjVar2 != null) {
                    rjVar2.U0 = false;
                    org.telegram.ui.Components.cg cgVar = rjVar2.V0;
                    if (cgVar != null) {
                        cgVar.u(false);
                        break;
                    }
                }
                break;
        }
    }
}
