package di;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class lc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uc b;

    public /* synthetic */ lc(uc ucVar, int i10) {
        this.a = i10;
        this.b = ucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uc ucVar = this.b;
                sc scVar = ucVar.M;
                if (scVar != null) {
                    long j10 = scVar.a;
                    if (j10 > 0) {
                        ucVar.H = j10;
                        break;
                    }
                }
                break;
            case 1:
                oc ocVar = this.b.a;
                if (ocVar != null) {
                    ocVar.f0();
                    break;
                }
                break;
            default:
                oc ocVar2 = this.b.a;
                if (ocVar2 != null) {
                    ocVar2.r();
                    break;
                }
                break;
        }
    }
}
