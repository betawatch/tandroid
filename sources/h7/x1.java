package h7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x1 implements q9.d {
    public static final x1 a = new x1();
    public static final q9.c b = new q9.c("logEventKey", ta.b.g(e2.c.s(h0.class, new e0(1))));
    public static final q9.c c = new q9.c("eventCount", ta.b.g(e2.c.s(h0.class, new e0(2))));
    public static final q9.c d = new q9.c("inferenceDurationStats", ta.b.g(e2.c.s(h0.class, new e0(3))));

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, x0Var.a);
        eVar.g(c, x0Var.b);
        eVar.g(d, x0Var.c);
    }
}
