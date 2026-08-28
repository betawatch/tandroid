package j4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ o0(s0 s0Var, int i9) {
        this.a = i9;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r();
                break;
            case 1:
                s0 s0Var = this.b;
                if (!s0Var.X) {
                    z zVar = s0Var.C;
                    zVar.getClass();
                    zVar.c(s0Var);
                    break;
                }
                break;
            default:
                this.b.R = true;
                break;
        }
    }
}
