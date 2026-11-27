// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class i60 implements zq7 {
    public static final i60 a = new i60();
    public static final sa4 b = sa4.c("name");
    public static final sa4 c = sa4.c("importance");
    public static final sa4 d = sa4.c("frames");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        pz2 pz2Var = (pz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((a90) pz2Var).a);
        a90 a90Var = (a90) pz2Var;
        ar7Var.e(c, a90Var.b);
        ar7Var.a(d, a90Var.c);
    }
}
