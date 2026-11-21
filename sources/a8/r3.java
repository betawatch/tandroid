package a8;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class r3 implements na.d {
    public static final r3 a = new r3();
    public static final na.c b = new na.c("maxMs", i5.c.p(p0.w(n0.class, new j0(1))));
    public static final na.c c = new na.c("minMs", i5.c.p(p0.w(n0.class, new j0(2))));
    public static final na.c d = new na.c("avgMs", i5.c.p(p0.w(n0.class, new j0(3))));
    public static final na.c e = new na.c("firstQuartileMs", i5.c.p(p0.w(n0.class, new j0(4))));
    public static final na.c f = new na.c("medianMs", i5.c.p(p0.w(n0.class, new j0(5))));
    public static final na.c g = new na.c("thirdQuartileMs", i5.c.p(p0.w(n0.class, new j0(6))));

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        l7 l7Var = (l7) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, l7Var.a);
        eVar.a(c, l7Var.b);
        eVar.a(d, l7Var.c);
        eVar.a(e, l7Var.d);
        eVar.a(f, l7Var.e);
        eVar.a(g, l7Var.f);
    }
}
