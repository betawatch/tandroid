package ag;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ l1(t1 t1Var, int i10) {
        this.a = i10;
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s1 s1Var = this.b.a;
                if (s1Var != null) {
                    s1Var.b();
                    break;
                }
                break;
            case 1:
                t1 t1Var = this.b;
                t1Var.c.a(t1Var.r);
                r1 r1Var = t1Var.d;
                r1Var.getClass();
                r1Var.postRunnable(new p1(r1Var, 2));
                t1Var.d = null;
                break;
            default:
                t1 t1Var2 = this.b;
                t1Var2.c.q(t1Var2.x);
                break;
        }
    }
}
