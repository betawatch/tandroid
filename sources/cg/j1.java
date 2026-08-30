package cg;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ j1(p1 p1Var, int i10) {
        this.a = i10;
        this.b = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o1 o1Var = this.b.a;
                if (o1Var != null) {
                    o1Var.b();
                    break;
                }
                break;
            case 1:
                p1 p1Var = this.b;
                p1Var.c.a(p1Var.r);
                n1 n1Var = p1Var.d;
                n1Var.getClass();
                n1Var.postRunnable(new m1(n1Var, 2));
                p1Var.d = null;
                break;
            default:
                p1 p1Var2 = this.b;
                p1Var2.c.q(p1Var2.x);
                break;
        }
    }
}
