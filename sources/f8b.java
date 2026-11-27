// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
