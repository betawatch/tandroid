// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class f60 implements zq7 {
    public static final f60 a = new f60();
    public static final sa4 b = sa4.c("threads");
    public static final sa4 c = sa4.c("exception");
    public static final sa4 d = sa4.c("appExitInfo");
    public static final sa4 e = sa4.c("profilingManagerInfo");
    public static final sa4 f = sa4.c("signal");
    public static final sa4 g = sa4.c("binaries");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        qz2 qz2Var = (qz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((w80) qz2Var).a);
        w80 w80Var = (w80) qz2Var;
        ar7Var.a(c, w80Var.b);
        ar7Var.a(d, w80Var.c);
        ar7Var.a(e, w80Var.d);
        ar7Var.a(f, w80Var.e);
        ar7Var.a(g, w80Var.f);
    }
}
