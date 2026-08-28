package j7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k4 implements q9.d {
    public static final k4 a = new k4();
    public static final q9.c b = new q9.c("maxMs", ta.b.g(j3.r0.r(w.class, new s(1))));
    public static final q9.c c = new q9.c("minMs", ta.b.g(j3.r0.r(w.class, new s(2))));
    public static final q9.c d = new q9.c("avgMs", ta.b.g(j3.r0.r(w.class, new s(3))));
    public static final q9.c e = new q9.c("firstQuartileMs", ta.b.g(j3.r0.r(w.class, new s(4))));
    public static final q9.c f = new q9.c("medianMs", ta.b.g(j3.r0.r(w.class, new s(5))));
    public static final q9.c g = new q9.c("thirdQuartileMs", ta.b.g(j3.r0.r(w.class, new s(6))));

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, maVar.a);
        eVar.g(c, maVar.b);
        eVar.g(d, maVar.c);
        eVar.g(e, maVar.d);
        eVar.g(f, maVar.e);
        eVar.g(g, maVar.f);
    }
}
