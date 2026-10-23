package ei;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc b;

    public /* synthetic */ wb(gc gcVar, int i10) {
        this.a = i10;
        this.b = gcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gc gcVar = this.b;
                ec ecVar = gcVar.M;
                if (ecVar != null) {
                    long j10 = ecVar.a;
                    if (j10 > 0) {
                        gcVar.H = j10;
                        break;
                    }
                }
                break;
            case 1:
                zb zbVar = this.b.a;
                if (zbVar != null) {
                    zbVar.D();
                    break;
                }
                break;
            default:
                zb zbVar2 = this.b.a;
                if (zbVar2 != null) {
                    zbVar2.j();
                    break;
                }
                break;
        }
    }
}
