// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fe6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ mh6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fe6(mh6 mh6Var, int i, boolean z, boolean z2) {
        this.b = mh6Var;
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
        mh6 mh6Var = this.b;
        switch (b) {
            case 0:
                mh6Var.L1(z3, z2, z);
                break;
            default:
                boolean z4 = mh6Var.K;
                mh6Var.K = z3;
                mh6Var.L1(z2, z, true);
                mh6Var.K = z4;
                break;
        }
    }

    public /* synthetic */ fe6(mh6 mh6Var, boolean z, boolean z2, boolean z3) {
        this.b = mh6Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
