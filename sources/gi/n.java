package gi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ la b;

    public /* synthetic */ n(la laVar, int i3) {
        this.a = i3;
        this.b = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                la laVar = this.b;
                laVar.K0 = false;
                laVar.L0 = TLObject.FLAG_31;
                laVar.invalidate();
                laVar.S0.setVisibility(0);
                laVar.T0.setVisibility(0);
                break;
            default:
                va vaVar = this.b.S1;
                ja jaVar = vaVar.Y0;
                if (jaVar != null) {
                    jaVar.P = false;
                    jaVar.c();
                    ja jaVar2 = vaVar.Y0;
                    jaVar2.m(0L);
                    fb fbVar = jaVar2.G;
                    if (fbVar != null) {
                        fbVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
