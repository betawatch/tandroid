package i9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t implements s9.d {
    public static final t a = new t();
    public static final s9.c b = s9.c.c("timestamp");
    public static final s9.c c = s9.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final s9.c d = s9.c.c("app");
    public static final s9.c e = s9.c.c("device");
    public static final s9.c f = s9.c.c("log");
    public static final s9.c g = s9.c.c("rollouts");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        s9.e eVar = (s9.e) obj2;
        l0 l0Var = (l0) ((a2) obj);
        eVar.c(b, l0Var.a);
        eVar.e(c, l0Var.b);
        eVar.e(d, l0Var.c);
        eVar.e(e, l0Var.d);
        eVar.e(f, l0Var.e);
        eVar.e(g, l0Var.f);
    }
}
