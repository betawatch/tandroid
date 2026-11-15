package hi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia b;

    public /* synthetic */ n(ia iaVar, int i7) {
        this.a = i7;
        this.b = iaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                ia iaVar = this.b;
                iaVar.K0 = false;
                iaVar.L0 = TLObject.FLAG_31;
                iaVar.invalidate();
                iaVar.S0.setVisibility(0);
                iaVar.T0.setVisibility(0);
                break;
            default:
                sa saVar = this.b.S1;
                ga gaVar = saVar.Y0;
                if (gaVar != null) {
                    gaVar.P = false;
                    gaVar.c();
                    ga gaVar2 = saVar.Y0;
                    gaVar2.m(0L);
                    cb cbVar = gaVar2.G;
                    if (cbVar != null) {
                        cbVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
