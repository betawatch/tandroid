package kh;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb b;

    public /* synthetic */ n(mb mbVar, int i9) {
        this.a = i9;
        this.b = mbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                mb mbVar = this.b;
                mbVar.G0 = false;
                mbVar.H0 = TLObject.FLAG_31;
                mbVar.invalidate();
                mbVar.O0.setVisibility(0);
                mbVar.P0.setVisibility(0);
                break;
            default:
                wb wbVar = this.b.O1;
                kb kbVar = wbVar.T0;
                if (kbVar != null) {
                    kbVar.K = false;
                    kbVar.c();
                    kb kbVar2 = wbVar.T0;
                    kbVar2.m(0L);
                    gc gcVar = kbVar2.B;
                    if (gcVar != null) {
                        gcVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
