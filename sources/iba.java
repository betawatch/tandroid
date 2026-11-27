// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class iba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uba b;

    public /* synthetic */ iba(uba ubaVar, byte b) {
        this.a = b;
        this.b = ubaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        uba ubaVar = this.b;
        switch (b) {
            case 0:
                ubaVar.b0();
                break;
            case 1:
                m01.u(ubaVar.getParentActivity(), ob6.M0(2131752119, null));
                break;
            default:
                ubaVar.c.g3.O(true);
                break;
        }
    }
}
