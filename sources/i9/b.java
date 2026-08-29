package i9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements s9.d {
    public static final b a = new b();
    public static final s9.c b = s9.c.c("pid");
    public static final s9.c c = s9.c.c("processName");
    public static final s9.c d = s9.c.c("reasonCode");
    public static final s9.c e = s9.c.c("importance");
    public static final s9.c f = s9.c.c("pss");
    public static final s9.c g = s9.c.c("rss");
    public static final s9.c h = s9.c.c("timestamp");
    public static final s9.c i = s9.c.c("traceFile");
    public static final s9.c j = s9.c.c("buildIdMappingForArch");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        s9.e eVar = (s9.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.b(b, b0Var.a);
        eVar.e(c, b0Var.b);
        eVar.b(d, b0Var.c);
        eVar.b(e, b0Var.d);
        eVar.c(f, b0Var.e);
        eVar.c(g, b0Var.f);
        eVar.c(h, b0Var.g);
        eVar.e(i, b0Var.h);
        eVar.e(j, b0Var.i);
    }
}
