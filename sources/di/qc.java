package di;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc b;

    public /* synthetic */ qc(zc zcVar, int i10) {
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
                tc tcVar = this.b.a;
                if (tcVar != null) {
                    tcVar.V();
                    break;
                }
                break;
            default:
                tc tcVar2 = this.b.a;
                if (tcVar2 != null) {
                    tcVar2.n();
                    break;
                }
                break;
        }
    }
}
