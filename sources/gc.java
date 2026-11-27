// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hc b;

    public /* synthetic */ gc(hc hcVar, byte b) {
        this.a = b;
        this.b = hcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hc hcVar = this.b;
        switch (b) {
            case 0:
                hcVar.invalidateSelf();
                break;
            case 1:
            default:
                hcVar.a();
                break;
        }
    }
}
