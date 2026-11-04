package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r4 implements ma.d {
    public static final r4 a = new r4();
    public static final ma.c b = new ma.c("maxMs", k2.p1.o(a1.g.w(e0.class, new z(1))));
    public static final ma.c c = new ma.c("minMs", k2.p1.o(a1.g.w(e0.class, new z(2))));
    public static final ma.c d = new ma.c("avgMs", k2.p1.o(a1.g.w(e0.class, new z(3))));
    public static final ma.c e = new ma.c("firstQuartileMs", k2.p1.o(a1.g.w(e0.class, new z(4))));
    public static final ma.c f = new ma.c("medianMs", k2.p1.o(a1.g.w(e0.class, new z(5))));
    public static final ma.c g = new ma.c("thirdQuartileMs", k2.p1.o(a1.g.w(e0.class, new z(6))));

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ta taVar = (ta) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(b, taVar.a);
        eVar.a(c, taVar.b);
        eVar.a(d, taVar.c);
        eVar.a(e, taVar.d);
        eVar.a(f, taVar.e);
        eVar.a(g, taVar.f);
    }
}
