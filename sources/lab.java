// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lab implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lab(sbb sbbVar, boolean z, byte b) {
        this.a = b;
        this.b = sbbVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                sbbVar.c(z);
                break;
            case 1:
                if (!z) {
                    sbbVar.K0.b(false, false);
                    break;
                }
                break;
            default:
                sbbVar.S = null;
                sbbVar.e = false;
                sbbVar.o(z);
                break;
        }
    }
}
