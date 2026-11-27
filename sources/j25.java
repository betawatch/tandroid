// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class j25 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ icc b;

    public /* synthetic */ j25(icc iccVar, byte b) {
        this.a = b;
        this.b = iccVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a((c35) obj, (String) obj2);
                break;
            default:
                iccVar.a((Long) obj, (Boolean) obj2);
                break;
        }
    }
}
