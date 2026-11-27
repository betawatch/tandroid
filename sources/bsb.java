// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bsb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ksb b;

    public /* synthetic */ bsb(ksb ksbVar, byte b) {
        this.a = b;
        this.b = ksbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ksb ksbVar = this.b;
        switch (b) {
            case 0:
                isb isbVar = ksbVar.N;
                if (isbVar != null) {
                    long j = isbVar.a;
                    if (j > 0) {
                        ksbVar.I = j;
                        break;
                    }
                }
                break;
            case 1:
                esb esbVar = ksbVar.a;
                if (esbVar != null) {
                    esbVar.S1();
                    break;
                }
                break;
            default:
                esb esbVar2 = ksbVar.a;
                if (esbVar2 != null) {
                    esbVar2.V();
                    break;
                }
                break;
        }
    }
}
