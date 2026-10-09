package m4;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ u(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b0 b0Var = this.b;
                z zVar = b0Var.u;
                if (zVar != null) {
                    b0Var.t.D(zVar);
                    break;
                }
                break;
            case 1:
                this.b.getClass();
                break;
            case 2:
                b0.a(this.b);
                break;
            default:
                this.b.t();
                break;
        }
    }
}
