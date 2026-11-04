package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n implements ma.d {
    public static final n a = new n();
    public static final ma.c b = ma.c.c("baseAddress");
    public static final ma.c c = ma.c.c("size");
    public static final ma.c d = ma.c.c("name");
    public static final ma.c e = ma.c.c("uuid");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.f(b, x0Var.a);
        eVar.f(c, x0Var.b);
        eVar.a(d, x0Var.c);
        String str = x0Var.d;
        eVar.a(e, str != null ? str.getBytes(u2.a) : null);
    }
}
