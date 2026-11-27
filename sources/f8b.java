// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f8b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k8b b;

    public /* synthetic */ f8b(k8b k8bVar, byte b) {
        this.a = b;
        this.b = k8bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k8b k8bVar = this.b;
        switch (b) {
            case 0:
                k8bVar.b();
                break;
            case 1:
                hl.c3(new f8b(k8bVar, (byte) 0));
                break;
            case 2:
                k8bVar.dismiss();
                break;
            default:
                sh9 sh9Var = k8bVar.I;
                if (sh9Var != null) {
                    sh9Var.a(null);
                    k8bVar.I = null;
                }
                k8bVar.dismiss();
                break;
        }
    }
}
