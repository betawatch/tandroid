package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lk b;

    public /* synthetic */ kk(lk lkVar, int i7) {
        this.a = i7;
        this.b = lkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qj qjVar = this.b.I.a0;
                if (qjVar != null) {
                    qjVar.W0();
                    break;
                }
                break;
            default:
                qj qjVar2 = this.b.I.a0;
                if (qjVar2 != null) {
                    qjVar2.U0 = false;
                    org.telegram.ui.Components.sf sfVar = qjVar2.V0;
                    if (sfVar != null) {
                        sfVar.u(false);
                        break;
                    }
                }
                break;
        }
    }
}
