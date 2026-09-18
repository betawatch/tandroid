package ci;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc b;

    public /* synthetic */ pc(zc zcVar, int i10) {
        this.a = i10;
        this.b = zcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zc zcVar = this.b;
                xc xcVar = zcVar.M;
                if (xcVar != null) {
                    long j3 = xcVar.a;
                    if (j3 > 0) {
                        zcVar.H = j3;
                        break;
                    }
                }
                break;
            case 1:
                sc scVar = this.b.a;
                if (scVar != null) {
                    scVar.b0();
                    break;
                }
                break;
            default:
                sc scVar2 = this.b.a;
                if (scVar2 != null) {
                    scVar2.r();
                    break;
                }
                break;
        }
    }
}
