// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d70 implements cq7 {
    public static final d70 a = new d70();
    public static final wa4 b = wa4.c("threads");
    public static final wa4 c = wa4.c("exception");
    public static final wa4 d = wa4.c("appExitInfo");
    public static final wa4 e = wa4.c("profilingManagerInfo");
    public static final wa4 f = wa4.c("signal");
    public static final wa4 g = wa4.c("binaries");

    @Override // b44
    public final void a(Object obj, Object obj2) {
        g03 g03Var = (g03) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, ((u90) g03Var).a);
        u90 u90Var = (u90) g03Var;
        dq7Var.a(c, u90Var.b);
        dq7Var.a(d, u90Var.c);
        dq7Var.a(e, u90Var.d);
        dq7Var.a(f, u90Var.e);
        dq7Var.a(g, u90Var.f);
    }
}
