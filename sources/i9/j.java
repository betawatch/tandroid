package i9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j implements s9.d {
    public static final j a = new j();
    public static final s9.c b = s9.c.c("generator");
    public static final s9.c c = s9.c.c("identifier");
    public static final s9.c d = s9.c.c("appQualitySessionId");
    public static final s9.c e = s9.c.c("startedAt");
    public static final s9.c f = s9.c.c("endedAt");
    public static final s9.c g = s9.c.c("crashed");
    public static final s9.c h = s9.c.c("app");
    public static final s9.c i = s9.c.c("user");
    public static final s9.c j = s9.c.c("os");
    public static final s9.c k = s9.c.c("device");
    public static final s9.c l = s9.c.c("events");
    public static final s9.c m = s9.c.c("generatorType");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        s9.e eVar = (s9.e) obj2;
        h0 h0Var = (h0) ((d2) obj);
        eVar.e(b, h0Var.a);
        eVar.e(c, h0Var.b.getBytes(e2.a));
        eVar.e(d, h0Var.c);
        eVar.c(e, h0Var.d);
        eVar.e(f, h0Var.e);
        eVar.d(g, h0Var.f);
        eVar.e(h, h0Var.g);
        eVar.e(i, h0Var.h);
        eVar.e(j, h0Var.i);
        eVar.e(k, h0Var.j);
        eVar.e(l, h0Var.k);
        eVar.b(m, h0Var.l);
    }
}
