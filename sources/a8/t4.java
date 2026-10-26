package a8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class t4 implements ka.d {
    public static final t4 a = new t4();
    public static final ka.c b = new ka.c("maxMs", ic.a.m(a1.g.x(e0.class, new z(1))));
    public static final ka.c c = new ka.c("minMs", ic.a.m(a1.g.x(e0.class, new z(2))));
    public static final ka.c d = new ka.c("avgMs", ic.a.m(a1.g.x(e0.class, new z(3))));
    public static final ka.c e = new ka.c("firstQuartileMs", ic.a.m(a1.g.x(e0.class, new z(4))));
    public static final ka.c f = new ka.c("medianMs", ic.a.m(a1.g.x(e0.class, new z(5))));
    public static final ka.c g = new ka.c("thirdQuartileMs", ic.a.m(a1.g.x(e0.class, new z(6))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        va vaVar = (va) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, vaVar.a);
        eVar.a(c, vaVar.b);
        eVar.a(d, vaVar.c);
        eVar.a(e, vaVar.d);
        eVar.a(f, vaVar.e);
        eVar.a(g, vaVar.f);
    }
}
