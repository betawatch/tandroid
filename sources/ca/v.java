package ca;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v implements ma.d {
    public static final v a = new v();
    public static final ma.c b = ma.c.c("timestamp");
    public static final ma.c c = ma.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final ma.c d = ma.c.c("app");
    public static final ma.c e = ma.c.c("device");
    public static final ma.c f = ma.c.c("log");
    public static final ma.c g = ma.c.c("rollouts");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        t0 t0Var = (t0) ((q2) obj);
        eVar.f(b, t0Var.a);
        eVar.a(c, t0Var.b);
        eVar.a(d, t0Var.c);
        eVar.a(e, t0Var.d);
        eVar.a(f, t0Var.e);
        eVar.a(g, t0Var.f);
    }
}
