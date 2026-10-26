package aa;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class t implements ka.d {
    public static final t a = new t();
    public static final ka.c b = ka.c.c("timestamp");
    public static final ka.c c = ka.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final ka.c d = ka.c.c("app");
    public static final ka.c e = ka.c.c("device");
    public static final ka.c f = ka.c.c("log");
    public static final ka.c g = ka.c.c("rollouts");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        n0 n0Var = (n0) ((c2) obj);
        eVar.f(b, n0Var.a);
        eVar.a(c, n0Var.b);
        eVar.a(d, n0Var.c);
        eVar.a(e, n0Var.d);
        eVar.a(f, n0Var.e);
        eVar.a(g, n0Var.f);
    }
}
