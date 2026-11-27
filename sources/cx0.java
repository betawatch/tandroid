// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cx0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ula b;

    public /* synthetic */ cx0(ula ulaVar, byte b) {
        this.a = b;
        this.b = ulaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ula ulaVar = this.b;
        switch (b) {
            case 0:
                ulaVar.a(true);
                break;
            case 1:
                ulaVar.a(true);
                break;
            case 2:
                if (!ulaVar.I && ulaVar.U) {
                    ulaVar.c();
                    break;
                }
                break;
            default:
                ulaVar.a(true);
                break;
        }
    }
}
