package m4;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ y(f0 f0Var, int i10) {
        this.a = i10;
        this.b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                d0 d0Var = f0Var.u;
                if (d0Var != null) {
                    f0Var.t.C(d0Var);
                    break;
                }
                break;
            case 1:
                this.b.getClass();
                break;
            case 2:
                f0.a(this.b);
                break;
            default:
                this.b.t();
                break;
        }
    }
}
