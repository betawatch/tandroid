package fi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ la b;

    public /* synthetic */ n(la laVar, int i7) {
        this.a = i7;
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
                laVar.J0 = false;
                laVar.K0 = TLObject.FLAG_31;
                laVar.invalidate();
                laVar.R0.setVisibility(0);
                laVar.S0.setVisibility(0);
                break;
            default:
                va vaVar = this.b.R1;
                ja jaVar = vaVar.X0;
                if (jaVar != null) {
                    jaVar.O = false;
                    jaVar.c();
                    ja jaVar2 = vaVar.X0;
                    jaVar2.m(0L);
                    fb fbVar = jaVar2.F;
                    if (fbVar != null) {
                        fbVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
