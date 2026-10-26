package aa;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i implements ka.d {
    public static final i a = new i();
    public static final ka.c b = ka.c.c("arch");
    public static final ka.c c = ka.c.c("model");
    public static final ka.c d = ka.c.c("cores");
    public static final ka.c e = ka.c.c("ram");
    public static final ka.c f = ka.c.c("diskSpace");
    public static final ka.c g = ka.c.c("simulator");
    public static final ka.c h = ka.c.c("state");
    public static final ka.c i = ka.c.c("manufacturer");
    public static final ka.c j = ka.c.c("modelClass");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        l0 l0Var = (l0) ((o1) obj);
        eVar.e(b, l0Var.a);
        eVar.a(c, l0Var.b);
        eVar.e(d, l0Var.c);
        eVar.f(e, l0Var.d);
        eVar.f(f, l0Var.e);
        eVar.d(g, l0Var.f);
        eVar.e(h, l0Var.g);
        eVar.a(i, l0Var.h);
        eVar.a(j, l0Var.i);
    }
}
