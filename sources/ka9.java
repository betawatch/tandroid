// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ka9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ la9 b;

    public /* synthetic */ ka9(la9 la9Var, byte b) {
        this.a = b;
        this.b = la9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        la9 la9Var = this.b;
        switch (b) {
            case 0:
                na9 na9Var = la9Var.b.d;
                if (na9Var != null) {
                    na9Var.postRunnable(na9Var.x);
                    break;
                }
                break;
            case 1:
                na9 na9Var2 = la9Var.b.d;
                if (na9Var2 != null) {
                    na9Var2.postRunnable(na9Var2.x);
                    break;
                }
                break;
            default:
                pa9 pa9Var = la9Var.b;
                na9 na9Var3 = pa9Var.d;
                na9Var3.getClass();
                na9Var3.postRunnable(new ma9(na9Var3, (byte) 1));
                pa9Var.d = null;
                break;
        }
    }
}
