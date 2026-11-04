package ci;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9 b;
    public final /* synthetic */ long c;

    public /* synthetic */ b9(c9 c9Var, long j10, int i3) {
        this.a = i3;
        this.b = c9Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c9 c9Var = this.b;
                c9Var.q.b0(c9Var.b, c9Var.c, this.c, true, true, c9Var.n);
                break;
            default:
                c9 c9Var2 = this.b;
                c9Var2.q.b0(c9Var2.b, c9Var2.c, this.c, true, true, c9Var2.n);
                break;
        }
    }
}
