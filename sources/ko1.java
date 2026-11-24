// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ko1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ byte b;
    public final /* synthetic */ mu1 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ko1(int i, mu1 mu1Var, boolean z) {
        this.b = i;
        this.c = mu1Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        mu1 mu1Var = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                mu1Var.Sc(b2, z);
                break;
            default:
                if (b2 != 2) {
                    mu1Var.X9();
                    mu1Var.pc();
                }
                no2.f(u21.b0(mu1Var), b2, z);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ko1(mu1 mu1Var, boolean z, int i) {
        this.c = mu1Var;
        this.d = z;
        this.b = i;
    }
}
