// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c70 implements cq7 {
    public static final c70 a = new c70();
    public static final wa4 b = wa4.c("baseAddress");
    public static final wa4 c = wa4.c("size");
    public static final wa4 d = wa4.c("name");
    public static final wa4 e = wa4.c("uuid");

    @Override // b44
    public final void a(Object obj, Object obj2) {
        b03 b03Var = (b03) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.g(b, ((v90) b03Var).a);
        v90 v90Var = (v90) b03Var;
        dq7Var.g(c, v90Var.b);
        dq7Var.a(d, v90Var.c);
        String str = v90Var.d;
        dq7Var.a(e, str != null ? str.getBytes(s03.a) : null);
    }
}
