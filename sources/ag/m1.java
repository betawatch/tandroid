package ag;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ m1(n1 n1Var, int i10) {
        this.a = i10;
        this.b = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r1 r1Var = this.b.b.d;
                if (r1Var != null) {
                    r1Var.postRunnable(r1Var.w);
                    break;
                }
                break;
            case 1:
                r1 r1Var2 = this.b.b.d;
                if (r1Var2 != null) {
                    r1Var2.postRunnable(r1Var2.w);
                    break;
                }
                break;
            default:
                t1 t1Var = this.b.b;
                r1 r1Var3 = t1Var.d;
                r1Var3.getClass();
                r1Var3.postRunnable(new p1(r1Var3, 2));
                t1Var.d = null;
                break;
        }
    }
}
