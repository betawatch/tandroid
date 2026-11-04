package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements ma.d {
    public static final t a = new t();
    public static final ma.c b = ma.c.c("processName");
    public static final ma.c c = ma.c.c("pid");
    public static final ma.c d = ma.c.c("importance");
    public static final ma.c e = ma.c.c("defaultProcess");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        e1 e1Var = (e1) ((j2) obj);
        eVar.a(b, e1Var.a);
        eVar.e(c, e1Var.b);
        eVar.e(d, e1Var.c);
        eVar.b(e, e1Var.d);
    }
}
