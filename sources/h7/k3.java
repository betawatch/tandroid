package h7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k3 implements q9.d {
    public static final k3 a = new k3();
    public static final q9.c b = new q9.c("maxMs", ta.b.g(e2.c.s(h0.class, new e0(1))));
    public static final q9.c c = new q9.c("minMs", ta.b.g(e2.c.s(h0.class, new e0(2))));
    public static final q9.c d = new q9.c("avgMs", ta.b.g(e2.c.s(h0.class, new e0(3))));
    public static final q9.c e = new q9.c("firstQuartileMs", ta.b.g(e2.c.s(h0.class, new e0(4))));
    public static final q9.c f = new q9.c("medianMs", ta.b.g(e2.c.s(h0.class, new e0(5))));
    public static final q9.c g = new q9.c("thirdQuartileMs", ta.b.g(e2.c.s(h0.class, new e0(6))));

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        f7 f7Var = (f7) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, f7Var.a);
        eVar.g(c, f7Var.b);
        eVar.g(d, f7Var.c);
        eVar.g(e, f7Var.d);
        eVar.g(f, f7Var.e);
        eVar.g(g, f7Var.f);
    }
}
