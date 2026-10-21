package ei;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                    zbVar.P();
                    break;
                }
                break;
            default:
                zb zbVar2 = this.b.a;
                if (zbVar2 != null) {
                    zbVar2.q();
                    break;
                }
                break;
        }
    }
}
