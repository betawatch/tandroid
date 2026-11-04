package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f3 implements ma.d {
    public static final f3 a = new f3();
    public static final ma.c b = new ma.c("logEventKey", k2.p1.o(a1.g.w(e0.class, new z(1))));
    public static final ma.c c = new ma.c("eventCount", k2.p1.o(a1.g.w(e0.class, new z(2))));
    public static final ma.c d = new ma.c("inferenceDurationStats", k2.p1.o(a1.g.w(e0.class, new z(3))));

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        q1 q1Var = (q1) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(b, q1Var.a);
        eVar.a(c, q1Var.b);
        eVar.a(d, q1Var.c);
    }
}
