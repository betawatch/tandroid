// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r9b b;

    public /* synthetic */ i9b(r9b r9bVar, byte b) {
        this.a = b;
        this.b = r9bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        r9b r9bVar = this.b;
        switch (b) {
            case 0:
                r9bVar.V = false;
                break;
            case 1:
                w9b w9bVar = r9bVar.a0;
                v21.h(w9bVar.c);
                super/*nx0*/.dismiss();
                break;
            case 2:
                r9bVar.w.setLoading(false);
                w9b w9bVar2 = r9bVar.a0;
                w9bVar2.G0();
                w9bVar2.l1.F(0);
                break;
            case 3:
                w9b w9bVar3 = r9bVar.a0;
                w9bVar3.G1 = 6;
                w9bVar3.l1.F(1);
                break;
            case 4:
                r9bVar.n.g(2);
                r9bVar.f.forceLayout();
                r9bVar.k();
                break;
            default:
                int i = r9bVar.a;
                w9b w9bVar4 = r9bVar.a0;
                if (i != 0) {
                    w9bVar4.onBackPressed();
                    break;
                } else {
                    w9bVar4.dismiss();
                    break;
                }
        }
    }
}
