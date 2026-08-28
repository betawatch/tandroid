package gh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ t7(u7 u7Var, long j10, int i9) {
        this.a = i9;
        this.b = u7Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u7 u7Var = this.b;
                u7Var.q.d0(u7Var.b, u7Var.c, this.c, true, true, u7Var.n);
                break;
            default:
                u7 u7Var2 = this.b;
                u7Var2.q.d0(u7Var2.b, u7Var2.c, this.c, true, true, u7Var2.n);
                break;
        }
    }
}
