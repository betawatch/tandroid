package j4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ q d;
    public final /* synthetic */ y e;

    public /* synthetic */ f0(h0 h0Var, i0 i0Var, q qVar, y yVar, int i9) {
        this.a = i9;
        this.b = h0Var;
        this.c = i0Var;
        this.d = qVar;
        this.e = yVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [j4.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [j4.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [j4.i0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                this.c.g(h0Var.a, h0Var.b, this.d, this.e);
                break;
            case 1:
                h0 h0Var2 = this.b;
                this.c.e(h0Var2.a, h0Var2.b, this.d, this.e);
                break;
            default:
                h0 h0Var3 = this.b;
                this.c.f(h0Var3.a, h0Var3.b, this.d, this.e);
                break;
        }
    }
}
