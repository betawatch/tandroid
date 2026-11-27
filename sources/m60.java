// default package

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class m60 implements zq7 {
    public static final m60 a = new m60();
    public static final sa4 b = sa4.c("timestamp");
    public static final sa4 c = sa4.c(TeXSymbolParser.TYPE_ATTR);
    public static final sa4 d = sa4.c("app");
    public static final sa4 e = sa4.c("device");
    public static final sa4 f = sa4.c("log");
    public static final sa4 g = sa4.c("rollouts");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        yz2 yz2Var = (yz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.g(b, ((t80) yz2Var).a);
        t80 t80Var = (t80) yz2Var;
        ar7Var.a(c, t80Var.b);
        ar7Var.a(d, t80Var.c);
        ar7Var.a(e, t80Var.d);
        ar7Var.a(f, t80Var.e);
        ar7Var.a(g, t80Var.f);
    }
}
