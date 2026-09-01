package dg;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ j1(k1 k1Var, int i10) {
        this.a = i10;
        this.b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m1 m1Var = this.b.b.d;
                if (m1Var != null) {
                    m1Var.postRunnable(m1Var.w);
                    break;
                }
                break;
            case 1:
                m1 m1Var2 = this.b.b.d;
                if (m1Var2 != null) {
                    m1Var2.postRunnable(m1Var2.w);
                    break;
                }
                break;
            default:
                o1 o1Var = this.b.b;
                m1 m1Var3 = o1Var.d;
                m1Var3.getClass();
                m1Var3.postRunnable(new l1(m1Var3, 2));
                o1Var.d = null;
                break;
        }
    }
}
