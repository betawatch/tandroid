package k9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class j implements u9.d {
    public static final j a = new j();
    public static final u9.c b = u9.c.c("generator");
    public static final u9.c c = u9.c.c("identifier");
    public static final u9.c d = u9.c.c("appQualitySessionId");
    public static final u9.c e = u9.c.c("startedAt");
    public static final u9.c f = u9.c.c("endedAt");
    public static final u9.c g = u9.c.c("crashed");
    public static final u9.c h = u9.c.c("app");
    public static final u9.c i = u9.c.c("user");
    public static final u9.c j = u9.c.c("os");
    public static final u9.c k = u9.c.c("device");
    public static final u9.c l = u9.c.c("events");
    public static final u9.c m = u9.c.c("generatorType");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        h0 h0Var = (h0) ((d2) obj);
        eVar.e(b, h0Var.a);
        eVar.e(c, h0Var.b.getBytes(e2.a));
        eVar.e(d, h0Var.c);
        eVar.b(e, h0Var.d);
        eVar.e(f, h0Var.e);
        eVar.d(g, h0Var.f);
        eVar.e(h, h0Var.g);
        eVar.e(i, h0Var.h);
        eVar.e(j, h0Var.i);
        eVar.e(k, h0Var.j);
        eVar.e(l, h0Var.k);
        eVar.a(m, h0Var.l);
    }
}
