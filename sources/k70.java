// default package

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k70 implements cq7 {
    public static final k70 a = new k70();
    public static final wa4 b = wa4.c("timestamp");
    public static final wa4 c = wa4.c(TeXSymbolParser.TYPE_ATTR);
    public static final wa4 d = wa4.c("app");
    public static final wa4 e = wa4.c("device");
    public static final wa4 f = wa4.c("log");
    public static final wa4 g = wa4.c("rollouts");

    @Override // b44
    public final void a(Object obj, Object obj2) {
        o03 o03Var = (o03) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.g(b, ((r90) o03Var).a);
        r90 r90Var = (r90) o03Var;
        dq7Var.a(c, r90Var.b);
        dq7Var.a(d, r90Var.c);
        dq7Var.a(e, r90Var.d);
        dq7Var.a(f, r90Var.e);
        dq7Var.a(g, r90Var.f);
    }
}
