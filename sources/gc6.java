// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gc6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ mf6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gc6(mf6 mf6Var, int i, boolean z, boolean z2) {
        this.b = mf6Var;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        mf6 mf6Var = this.b;
        switch (b) {
            case 0:
                mf6Var.K1(z3, z2, z);
                break;
            default:
                boolean z4 = mf6Var.K;
                mf6Var.K = z3;
                mf6Var.K1(z2, z, true);
                mf6Var.K = z4;
                break;
        }
    }

    public /* synthetic */ gc6(mf6 mf6Var, boolean z, boolean z2, boolean z3) {
        this.b = mf6Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
