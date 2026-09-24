package m4;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ u(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                y yVar = a0Var.u;
                if (yVar != null) {
                    a0Var.t.D(yVar);
                    break;
                }
                break;
            case 1:
                this.b.getClass();
                break;
            case 2:
                a0.a(this.b);
                break;
            default:
                this.b.t();
                break;
        }
    }
}
