package k9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i implements u9.d {
    public static final i a = new i();
    public static final u9.c b = u9.c.c("arch");
    public static final u9.c c = u9.c.c("model");
    public static final u9.c d = u9.c.c("cores");
    public static final u9.c e = u9.c.c("ram");
    public static final u9.c f = u9.c.c("diskSpace");
    public static final u9.c g = u9.c.c("simulator");
    public static final u9.c h = u9.c.c("state");
    public static final u9.c i = u9.c.c("manufacturer");
    public static final u9.c j = u9.c.c("modelClass");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        k0 k0Var = (k0) ((m1) obj);
        eVar.a(b, k0Var.a);
        eVar.e(c, k0Var.b);
        eVar.a(d, k0Var.c);
        eVar.b(e, k0Var.d);
        eVar.b(f, k0Var.e);
        eVar.d(g, k0Var.f);
        eVar.a(h, k0Var.g);
        eVar.e(i, k0Var.h);
        eVar.e(j, k0Var.i);
    }
}
