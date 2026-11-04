package ai;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ z5(g6 g6Var, int i3) {
        this.a = i3;
        this.b = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w5 w5Var = this.b.c;
                if (!w5Var.j.isEmpty()) {
                    w5Var.j.clear();
                    w5Var.h();
                    break;
                }
                break;
            case 1:
                w5 w5Var2 = this.b.c;
                if (!w5Var2.k.isEmpty()) {
                    w5Var2.k.clear();
                    w5Var2.h();
                    break;
                }
                break;
            case 2:
                w5 w5Var3 = this.b.c;
                if (!w5Var3.l.isEmpty()) {
                    w5Var3.l.clear();
                    w5Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(v5.a);
                break;
            case 4:
                this.b.c.i(v5.b);
                break;
            default:
                this.b.c.i(v5.c);
                break;
        }
    }
}
