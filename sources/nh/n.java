package nh;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wa b;

    public /* synthetic */ n(wa waVar, int i10) {
        this.a = i10;
        this.b = waVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                wa waVar = this.b;
                waVar.G0 = false;
                waVar.H0 = TLObject.FLAG_31;
                waVar.invalidate();
                waVar.O0.setVisibility(0);
                waVar.P0.setVisibility(0);
                break;
            default:
                gb gbVar = this.b.O1;
                va vaVar = gbVar.T0;
                if (vaVar != null) {
                    vaVar.K = false;
                    vaVar.c();
                    va vaVar2 = gbVar.T0;
                    vaVar2.m(0L);
                    qb qbVar = vaVar2.B;
                    if (qbVar != null) {
                        qbVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
