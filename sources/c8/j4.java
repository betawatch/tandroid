package c8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j4 implements na.d {
    public static final j4 a = new j4();
    public static final na.c b = new na.c("maxMs", jg.g.q(a8.p0.x(w.class, new s(1))));
    public static final na.c c = new na.c("minMs", jg.g.q(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("avgMs", jg.g.q(a8.p0.x(w.class, new s(3))));
    public static final na.c e = new na.c("firstQuartileMs", jg.g.q(a8.p0.x(w.class, new s(4))));
    public static final na.c f = new na.c("medianMs", jg.g.q(a8.p0.x(w.class, new s(5))));
    public static final na.c g = new na.c("thirdQuartileMs", jg.g.q(a8.p0.x(w.class, new s(6))));

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        la laVar = (la) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, laVar.a);
        eVar.a(c, laVar.b);
        eVar.a(d, laVar.c);
        eVar.a(e, laVar.d);
        eVar.a(f, laVar.e);
        eVar.a(g, laVar.f);
    }
}
