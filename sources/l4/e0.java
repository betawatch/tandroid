package l4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ p d;
    public final /* synthetic */ x e;

    public /* synthetic */ e0(g0 g0Var, h0 h0Var, p pVar, x xVar, int i10) {
        this.a = i10;
        this.b = g0Var;
        this.c = h0Var;
        this.d = pVar;
        this.e = xVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l4.h0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, l4.h0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, l4.h0] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                this.c.h(g0Var.a, g0Var.b, this.d, this.e);
                break;
            case 1:
                g0 g0Var2 = this.b;
                this.c.a(g0Var2.a, g0Var2.b, this.d, this.e);
                break;
            default:
                g0 g0Var3 = this.b;
                this.c.g(g0Var3.a, g0Var3.b, this.d, this.e);
                break;
        }
    }
}
