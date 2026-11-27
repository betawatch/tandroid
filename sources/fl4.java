// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
