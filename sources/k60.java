// default package

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class k60 implements zn7 {
    public static final k60 a = new k60();
    public static final w84 b = w84.c("timestamp");
    public static final w84 c = w84.c(TeXSymbolParser.TYPE_ATTR);
    public static final w84 d = w84.c("app");
    public static final w84 e = w84.c("device");
    public static final w84 f = w84.c("log");
    public static final w84 g = w84.c("rollouts");

    @Override // q24
    public final void a(Object obj, Object obj2) {
        dz2 dz2Var = (dz2) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.g(b, ((r80) dz2Var).a);
        r80 r80Var = (r80) dz2Var;
        ao7Var.a(c, r80Var.b);
        ao7Var.a(d, r80Var.c);
        ao7Var.a(e, r80Var.d);
        ao7Var.a(f, r80Var.e);
        ao7Var.a(g, r80Var.f);
    }
}
