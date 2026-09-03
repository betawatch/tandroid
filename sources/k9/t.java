package k9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t implements u9.d {
    public static final t a = new t();
    public static final u9.c b = u9.c.c("timestamp");
    public static final u9.c c = u9.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final u9.c d = u9.c.c("app");
    public static final u9.c e = u9.c.c("device");
    public static final u9.c f = u9.c.c("log");
    public static final u9.c g = u9.c.c("rollouts");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        l0 l0Var = (l0) ((a2) obj);
        eVar.b(b, l0Var.a);
        eVar.e(c, l0Var.b);
        eVar.e(d, l0Var.c);
        eVar.e(e, l0Var.d);
        eVar.e(f, l0Var.e);
        eVar.e(g, l0Var.f);
    }
}
