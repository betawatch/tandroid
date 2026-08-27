package lh;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ibVar.G0 = false;
                ibVar.H0 = TLObject.FLAG_31;
                ibVar.invalidate();
                ibVar.O0.setVisibility(0);
                ibVar.P0.setVisibility(0);
                break;
            default:
                sb sbVar = this.b.O1;
                hb hbVar = sbVar.T0;
                if (hbVar != null) {
                    hbVar.K = false;
                    hbVar.c();
                    hb hbVar2 = sbVar.T0;
                    hbVar2.m(0L);
                    cc ccVar = hbVar2.B;
                    if (ccVar != null) {
                        ccVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
