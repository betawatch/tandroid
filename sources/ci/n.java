package ci;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc b;

    public /* synthetic */ n(bc bcVar, int i10) {
        this.a = i10;
        this.b = bcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                bc bcVar = this.b;
                bcVar.K0 = false;
                bcVar.L0 = TLObject.FLAG_31;
                bcVar.invalidate();
                bcVar.S0.setVisibility(0);
                bcVar.T0.setVisibility(0);
                break;
            default:
                lc lcVar = this.b.S1;
                zb zbVar = lcVar.X0;
                if (zbVar != null) {
                    zbVar.O = false;
                    zbVar.c();
                    zb zbVar2 = lcVar.X0;
                    zbVar2.m(0L);
                    wc wcVar = zbVar2.F;
                    if (wcVar != null) {
                        wcVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
