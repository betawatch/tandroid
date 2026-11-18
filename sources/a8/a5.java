package a8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class a5 implements na.d {
    public static final a5 a = new a5();
    public static final na.c b = new na.c("detectorOptions", i5.c.p(p0.w(n0.class, new j0(1))));
    public static final na.c c = new na.c("errorCodes", i5.c.p(p0.w(n0.class, new j0(2))));
    public static final na.c d = new na.c("totalInitializationMs", i5.c.p(p0.w(n0.class, new j0(3))));
    public static final na.c e = new na.c("loggingInitializationMs", i5.c.p(p0.w(n0.class, new j0(4))));
    public static final na.c f = new na.c("otherErrors", i5.c.p(p0.w(n0.class, new j0(5))));

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        s8 s8Var = (s8) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, s8Var.a);
        eVar.a(c, s8Var.b);
        eVar.a(d, null);
        eVar.a(e, null);
        eVar.a(f, null);
    }
}
