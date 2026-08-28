package g9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t implements q9.d {
    public static final t a = new t();
    public static final q9.c b = q9.c.c("timestamp");
    public static final q9.c c = q9.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final q9.c d = q9.c.c("app");
    public static final q9.c e = q9.c.c("device");
    public static final q9.c f = q9.c.c("log");
    public static final q9.c g = q9.c.c("rollouts");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        q9.e eVar = (q9.e) obj2;
        l0 l0Var = (l0) ((a2) obj);
        eVar.d(b, l0Var.a);
        eVar.g(c, l0Var.b);
        eVar.g(d, l0Var.c);
        eVar.g(e, l0Var.d);
        eVar.g(f, l0Var.e);
        eVar.g(g, l0Var.f);
    }
}
