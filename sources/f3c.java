// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ icc b;
    public final /* synthetic */ String c;

    public /* synthetic */ f3c(icc iccVar, String str, byte b) {
        this.a = b;
        this.b = iccVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a(str, Boolean.FALSE);
                break;
            case 1:
                iccVar.a(null, str);
                break;
            case 2:
                iccVar.a(null, str);
                break;
            default:
                iccVar.a(null, str);
                break;
        }
    }
}
