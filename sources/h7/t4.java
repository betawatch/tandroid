package h7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t4 implements q9.d {
    public static final t4 a = new t4();
    public static final q9.c b = new q9.c("detectorOptions", ta.b.g(e2.c.s(h0.class, new e0(1))));
    public static final q9.c c = new q9.c("errorCodes", ta.b.g(e2.c.s(h0.class, new e0(2))));
    public static final q9.c d = new q9.c("totalInitializationMs", ta.b.g(e2.c.s(h0.class, new e0(3))));
    public static final q9.c e = new q9.c("loggingInitializationMs", ta.b.g(e2.c.s(h0.class, new e0(4))));
    public static final q9.c f = new q9.c("otherErrors", ta.b.g(e2.c.s(h0.class, new e0(5))));

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        l8 l8Var = (l8) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, l8Var.a);
        eVar.g(c, l8Var.b);
        eVar.g(d, null);
        eVar.g(e, null);
        eVar.g(f, null);
    }
}
