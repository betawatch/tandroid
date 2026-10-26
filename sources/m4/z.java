package m4;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ z(f0 f0Var, int i10) {
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
