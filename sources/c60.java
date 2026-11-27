// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class c60 implements zq7 {
    public static final c60 a = new c60();
    public static final sa4 b = sa4.c("generator");
    public static final sa4 c = sa4.c("identifier");
    public static final sa4 d = sa4.c("appQualitySessionId");
    public static final sa4 e = sa4.c("startedAt");
    public static final sa4 f = sa4.c("endedAt");
    public static final sa4 g = sa4.c("crashed");
    public static final sa4 h = sa4.c("app");
    public static final sa4 i = sa4.c("user");
    public static final sa4 j = sa4.c("os");
    public static final sa4 k = sa4.c("device");
    public static final sa4 l = sa4.c("events");
    public static final sa4 m = sa4.c("generatorType");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        b03 b03Var = (b03) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((n80) b03Var).a);
        n80 n80Var = (n80) b03Var;
        ar7Var.a(c, n80Var.b.getBytes(c03.a));
        ar7Var.a(d, n80Var.c);
        ar7Var.g(e, n80Var.d);
        ar7Var.a(f, n80Var.e);
        ar7Var.d(g, n80Var.f);
        ar7Var.a(h, n80Var.g);
        ar7Var.a(i, n80Var.h);
        ar7Var.a(j, n80Var.i);
        ar7Var.a(k, n80Var.j);
        ar7Var.a(l, n80Var.k);
        ar7Var.e(m, n80Var.l);
    }
}
