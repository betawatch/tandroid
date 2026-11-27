// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fl4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ znb b;

    public /* synthetic */ fl4(znb znbVar, byte b) {
        this.a = b;
        this.b = znbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        znb znbVar = this.b;
        switch (b) {
            case 0:
                jn7.e().k(jn7.w4, znbVar, Boolean.TRUE, null, -1);
                break;
            default:
                znbVar.r();
                break;
        }
    }
}
