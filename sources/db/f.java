package db;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements ma.d {
    public static final f a = new f();
    public static final ma.c b = ma.c.c("processName");
    public static final ma.c c = ma.c.c("pid");
    public static final ma.c d = ma.c.c("importance");
    public static final ma.c e = ma.c.c("defaultProcess");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(b, e0Var.a);
        eVar.e(c, e0Var.b);
        eVar.e(d, e0Var.c);
        eVar.b(e, e0Var.d);
    }
}
