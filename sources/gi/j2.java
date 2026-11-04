package gi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;
    public final /* synthetic */ j8 c;

    public /* synthetic */ j2(n2 n2Var, j8 j8Var, int i3) {
        this.a = i3;
        this.b = n2Var;
        this.c = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n2 n2Var = this.b;
                n2Var.getClass();
                org.telegram.messenger.g0.i3(new j2(n2Var, this.c, 1), 320L);
                break;
            default:
                n2 n2Var2 = this.b;
                n2Var2.getClass();
                this.c.a(new ai.v2(n2Var2, 22));
                break;
        }
    }
}
