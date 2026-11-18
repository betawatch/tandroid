package c8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class j4 implements na.d {
    public static final j4 a = new j4();
    public static final na.c b = new na.c("maxMs", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c c = new na.c("minMs", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("avgMs", i5.c.p(a8.p0.x(w.class, new s(3))));
    public static final na.c e = new na.c("firstQuartileMs", i5.c.p(a8.p0.x(w.class, new s(4))));
    public static final na.c f = new na.c("medianMs", i5.c.p(a8.p0.x(w.class, new s(5))));
    public static final na.c g = new na.c("thirdQuartileMs", i5.c.p(a8.p0.x(w.class, new s(6))));

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
