package dg;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ i1(o1 o1Var, int i10) {
        this.a = i10;
        this.b = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n1 n1Var = this.b.a;
                if (n1Var != null) {
                    n1Var.b();
                    break;
                }
                break;
            case 1:
                o1 o1Var = this.b;
                o1Var.c.a(o1Var.r);
                m1 m1Var = o1Var.d;
                m1Var.getClass();
                m1Var.postRunnable(new l1(m1Var, 2));
                o1Var.d = null;
                break;
            default:
                o1 o1Var2 = this.b;
                o1Var2.c.q(o1Var2.x);
                break;
        }
    }
}
