// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
