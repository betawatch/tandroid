package a8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
