package h9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j implements r9.d {
    public static final j a = new j();
    public static final r9.c b = r9.c.c("generator");
    public static final r9.c c = r9.c.c("identifier");
    public static final r9.c d = r9.c.c("appQualitySessionId");
    public static final r9.c e = r9.c.c("startedAt");
    public static final r9.c f = r9.c.c("endedAt");
    public static final r9.c g = r9.c.c("crashed");
    public static final r9.c h = r9.c.c("app");
    public static final r9.c i = r9.c.c("user");
    public static final r9.c j = r9.c.c("os");
    public static final r9.c k = r9.c.c("device");
    public static final r9.c l = r9.c.c("events");
    public static final r9.c m = r9.c.c("generatorType");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        h0 h0Var = (h0) ((d2) obj);
        eVar.a(b, h0Var.a);
        eVar.a(c, h0Var.b.getBytes(e2.a));
        eVar.a(d, h0Var.c);
        eVar.c(e, h0Var.d);
        eVar.a(f, h0Var.e);
        eVar.g(g, h0Var.f);
        eVar.a(h, h0Var.g);
        eVar.a(i, h0Var.h);
        eVar.a(j, h0Var.i);
        eVar.a(k, h0Var.j);
        eVar.a(l, h0Var.k);
        eVar.d(m, h0Var.l);
    }
}
