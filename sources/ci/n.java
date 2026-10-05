package ci;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac b;

    public /* synthetic */ n(ac acVar, int i10) {
        this.a = i10;
        this.b = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                ac acVar = this.b;
                acVar.K0 = false;
                acVar.L0 = TLObject.FLAG_31;
                acVar.invalidate();
                acVar.S0.setVisibility(0);
                acVar.T0.setVisibility(0);
                break;
            default:
                kc kcVar = this.b.S1;
                yb ybVar = kcVar.X0;
                if (ybVar != null) {
                    ybVar.O = false;
                    ybVar.c();
                    yb ybVar2 = kcVar.X0;
                    ybVar2.m(0L);
                    vc vcVar = ybVar2.F;
                    if (vcVar != null) {
                        vcVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
