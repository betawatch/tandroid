package ig;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ w0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b1 b1Var = this.b.a;
                if (b1Var != null) {
                    b1Var.g();
                    break;
                }
                break;
            case 1:
                c1 c1Var = this.b;
                c1Var.c.a(c1Var.r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                break;
            default:
                c1 c1Var2 = this.b;
                c1Var2.c.q(c1Var2.y);
                break;
        }
    }
}
