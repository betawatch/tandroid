package c8;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class x2 implements na.d {
    public static final x2 a = new x2();
    public static final na.c b = new na.c("logEventKey", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c c = new na.c("eventCount", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("inferenceDurationStats", i5.c.p(a8.p0.x(w.class, new s(3))));

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        i1 i1Var = (i1) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, i1Var.a);
        eVar.a(c, i1Var.b);
        eVar.a(d, i1Var.c);
    }
}
