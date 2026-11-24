// default package

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e70 implements cq7 {
    public static final e70 a = new e70();
    public static final wa4 b = wa4.c(TeXSymbolParser.TYPE_ATTR);
    public static final wa4 c = wa4.c("reason");
    public static final wa4 d = wa4.c("frames");
    public static final wa4 e = wa4.c("causedBy");
    public static final wa4 f = wa4.c("overflowCount");

    @Override // b44
    public final void a(Object obj, Object obj2) {
        c03 c03Var = (c03) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, ((w90) c03Var).a);
        w90 w90Var = (w90) c03Var;
        dq7Var.a(c, w90Var.b);
        dq7Var.a(d, w90Var.c);
        dq7Var.a(e, w90Var.d);
        dq7Var.e(f, w90Var.e);
    }
}
