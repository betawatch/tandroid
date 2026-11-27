// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kx7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx7 b;

    public /* synthetic */ kx7(nx7 nx7Var, byte b) {
        this.a = b;
        this.b = nx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.c = null;
                xh4 xh4Var = nx7Var.a;
                if (xh4Var != null) {
                    xh4Var.v();
                    break;
                }
                break;
            default:
                nx7Var.b();
                break;
        }
    }
}
