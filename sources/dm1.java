// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu9 b;

    public /* synthetic */ dm1(mu9 mu9Var, byte b) {
        this.a = b;
        this.b = mu9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mu9 mu9Var = this.b;
        switch (b) {
            case 0:
                if (!mu9Var.N) {
                    mu9Var.N = true;
                    mu9Var.a(new dm1(mu9Var, (byte) 2), false);
                    mu9Var.s.invalidate();
                    break;
                }
                break;
            case 1:
                mu9Var.dismiss();
                break;
            case 2:
                mu9Var.getClass();
                hl.c3(new dm1(mu9Var, (byte) 4));
                break;
            case 3:
                hl.c3(new dm1(mu9Var, (byte) 5));
                break;
            case 4:
                mu9Var.c();
                break;
            default:
                mu9Var.b();
                break;
        }
    }
}
