package m4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
