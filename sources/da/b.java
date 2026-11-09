package da;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b implements na.d {
    public static final b a = new b();
    public static final na.c b = na.c.c("pid");
    public static final na.c c = na.c.c("processName");
    public static final na.c d = na.c.c("reasonCode");
    public static final na.c e = na.c.c("importance");
    public static final na.c f = na.c.c("pss");
    public static final na.c g = na.c.c("rss");
    public static final na.c h = na.c.c("timestamp");
    public static final na.c i = na.c.c("traceFile");
    public static final na.c j = na.c.c("buildIdMappingForArch");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        na.e eVar = (na.e) obj2;
        f0 f0Var = (f0) ((u1) obj);
        eVar.d(b, f0Var.a);
        eVar.a(c, f0Var.b);
        eVar.d(d, f0Var.c);
        eVar.d(e, f0Var.d);
        eVar.e(f, f0Var.e);
        eVar.e(g, f0Var.f);
        eVar.e(h, f0Var.g);
        eVar.a(i, f0Var.h);
        eVar.a(j, f0Var.i);
    }
}
