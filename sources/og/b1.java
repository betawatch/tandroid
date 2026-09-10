package og;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ b1(h1 h1Var, int i10) {
        this.a = i10;
        this.b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = this.b.a;
                if (g1Var != null) {
                    g1Var.b();
                    break;
                }
                break;
            case 1:
                h1 h1Var = this.b;
                h1Var.c.a(h1Var.r);
                f1 f1Var = h1Var.d;
                f1Var.getClass();
                f1Var.postRunnable(new e1(f1Var, 2));
                h1Var.d = null;
                break;
            default:
                h1 h1Var2 = this.b;
                h1Var2.c.q(h1Var2.x);
                break;
        }
    }
}
