package fi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib b;

    public /* synthetic */ n(ib ibVar, int i10) {
        this.a = i10;
        this.b = ibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                ib ibVar = this.b;
                ibVar.K0 = false;
                ibVar.L0 = TLObject.FLAG_31;
                ibVar.invalidate();
                ibVar.S0.setVisibility(0);
                ibVar.T0.setVisibility(0);
                break;
            default:
                sb sbVar = this.b.S1;
                gb gbVar = sbVar.X0;
                if (gbVar != null) {
                    gbVar.O = false;
                    gbVar.c();
                    gb gbVar2 = sbVar.X0;
                    gbVar2.m(0L);
                    cc ccVar = gbVar2.F;
                    if (ccVar != null) {
                        ccVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
