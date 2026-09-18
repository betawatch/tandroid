package ci;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec b;

    public /* synthetic */ n(ec ecVar, int i10) {
        this.a = i10;
        this.b = ecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                ec ecVar = this.b;
                ecVar.K0 = false;
                ecVar.L0 = TLObject.FLAG_31;
                ecVar.invalidate();
                ecVar.S0.setVisibility(0);
                ecVar.T0.setVisibility(0);
                break;
            default:
                oc ocVar = this.b.S1;
                cc ccVar = ocVar.X0;
                if (ccVar != null) {
                    ccVar.O = false;
                    ccVar.c();
                    cc ccVar2 = ocVar.X0;
                    ccVar2.m(0L);
                    zc zcVar = ccVar2.F;
                    if (zcVar != null) {
                        zcVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
