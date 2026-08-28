package j7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y2 implements q9.d {
    public static final y2 a = new y2();
    public static final q9.c b = new q9.c("logEventKey", ta.b.g(j3.r0.r(w.class, new s(1))));
    public static final q9.c c = new q9.c("eventCount", ta.b.g(j3.r0.r(w.class, new s(2))));
    public static final q9.c d = new q9.c("inferenceDurationStats", ta.b.g(j3.r0.r(w.class, new s(3))));

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, j1Var.a);
        eVar.g(c, j1Var.b);
        eVar.g(d, j1Var.c);
    }
}
