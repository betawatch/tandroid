// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
