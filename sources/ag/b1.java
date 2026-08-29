package ag;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ b1(f1 f1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                f1Var.c = null;
                o1 o1Var = f1Var.a;
                if (o1Var != null) {
                    o1Var.c();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
