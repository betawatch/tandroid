package di;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
