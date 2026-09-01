package k9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class m implements u9.d {
    public static final m a = new m();
    public static final u9.c b = u9.c.c("threads");
    public static final u9.c c = u9.c.c("exception");
    public static final u9.c d = u9.c.c("appExitInfo");
    public static final u9.c e = u9.c.c("signal");
    public static final u9.c f = u9.c.c("binaries");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        n0 n0Var = (n0) ((s1) obj);
        eVar.e(b, n0Var.a);
        eVar.e(c, n0Var.b);
        eVar.e(d, n0Var.c);
        eVar.e(e, n0Var.d);
        eVar.e(f, n0Var.e);
    }
}
