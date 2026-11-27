// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oqc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqc b;

    public /* synthetic */ oqc(pqc pqcVar, byte b) {
        this.a = b;
        this.b = pqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pqc pqcVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new oqc(pqcVar, (byte) 1));
                break;
            default:
                pqcVar.a();
                break;
        }
    }
}
