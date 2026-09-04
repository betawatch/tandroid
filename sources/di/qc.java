package di;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
