package a8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class e2 implements na.d {
    public static final e2 a = new e2();
    public static final na.c b = new na.c("logEventKey", i5.c.p(p0.w(n0.class, new j0(1))));
    public static final na.c c = new na.c("eventCount", i5.c.p(p0.w(n0.class, new j0(2))));
    public static final na.c d = new na.c("inferenceDurationStats", i5.c.p(p0.w(n0.class, new j0(3))));

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        f1 f1Var = (f1) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, f1Var.a);
        eVar.a(c, f1Var.b);
        eVar.a(d, f1Var.c);
    }
}
