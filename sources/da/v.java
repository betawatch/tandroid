package da;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class v implements na.d {
    public static final v a = new v();
    public static final na.c b = na.c.c("timestamp");
    public static final na.c c = na.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final na.c d = na.c.c("app");
    public static final na.c e = na.c.c("device");
    public static final na.c f = na.c.c("log");
    public static final na.c g = na.c.c("rollouts");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        na.e eVar = (na.e) obj2;
        t0 t0Var = (t0) ((q2) obj);
        eVar.e(b, t0Var.a);
        eVar.a(c, t0Var.b);
        eVar.a(d, t0Var.c);
        eVar.a(e, t0Var.d);
        eVar.a(f, t0Var.e);
        eVar.a(g, t0Var.f);
    }
}
