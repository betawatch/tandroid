package h9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t implements r9.d {
    public static final t a = new t();
    public static final r9.c b = r9.c.c("timestamp");
    public static final r9.c c = r9.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final r9.c d = r9.c.c("app");
    public static final r9.c e = r9.c.c("device");
    public static final r9.c f = r9.c.c("log");
    public static final r9.c g = r9.c.c("rollouts");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        l0 l0Var = (l0) ((a2) obj);
        eVar.c(b, l0Var.a);
        eVar.a(c, l0Var.b);
        eVar.a(d, l0Var.c);
        eVar.a(e, l0Var.d);
        eVar.a(f, l0Var.e);
        eVar.a(g, l0Var.f);
    }
}
