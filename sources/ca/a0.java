package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 implements ma.d {
    public static final a0 a = new a0();
    public static final ma.c b = ma.c.c("platform");
    public static final ma.c c = ma.c.c("version");
    public static final ma.c d = ma.c.c("buildVersion");
    public static final ma.c e = ma.c.c("jailbroken");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        n1 n1Var = (n1) ((r2) obj);
        eVar.e(b, n1Var.a);
        eVar.a(c, n1Var.b);
        eVar.a(d, n1Var.c);
        eVar.b(e, n1Var.d);
    }
}
