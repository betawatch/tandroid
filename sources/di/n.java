package di;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc b;

    public /* synthetic */ n(fc fcVar, int i10) {
        this.a = i10;
        this.b = fcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                fc fcVar = this.b;
                fcVar.K0 = false;
                fcVar.L0 = TLObject.FLAG_31;
                fcVar.invalidate();
                fcVar.S0.setVisibility(0);
                fcVar.T0.setVisibility(0);
                break;
            default:
                pc pcVar = this.b.S1;
                dc dcVar = pcVar.X0;
                if (dcVar != null) {
                    dcVar.O = false;
                    dcVar.c();
                    dc dcVar2 = pcVar.X0;
                    dcVar2.m(0L);
                    zc zcVar = dcVar2.F;
                    if (zcVar != null) {
                        zcVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
