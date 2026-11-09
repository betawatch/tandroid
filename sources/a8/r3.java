package a8;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class r3 implements na.d {
    public static final r3 a = new r3();
    public static final na.c b = new na.c("maxMs", jg.g.q(p0.w(n0.class, new j0(1))));
    public static final na.c c = new na.c("minMs", jg.g.q(p0.w(n0.class, new j0(2))));
    public static final na.c d = new na.c("avgMs", jg.g.q(p0.w(n0.class, new j0(3))));
    public static final na.c e = new na.c("firstQuartileMs", jg.g.q(p0.w(n0.class, new j0(4))));
    public static final na.c f = new na.c("medianMs", jg.g.q(p0.w(n0.class, new j0(5))));
    public static final na.c g = new na.c("thirdQuartileMs", jg.g.q(p0.w(n0.class, new j0(6))));

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
