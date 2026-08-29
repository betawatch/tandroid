package ag;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ j2 c;

    public /* synthetic */ c1(f1 f1Var, j2 j2Var, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.c = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                f1 f1Var = this.b;
                f1Var.f.f(new c1(f1Var, this.c, 0));
                break;
        }
    }
}
