// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class o60 implements zq7 {
    public static final o60 a = new o60();
    public static final sa4 b = sa4.c("rolloutVariant");
    public static final sa4 c = sa4.c("parameterKey");
    public static final sa4 d = sa4.c("parameterValue");
    public static final sa4 e = sa4.c("templateVersion");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        wz2 wz2Var = (wz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((i90) wz2Var).a);
        i90 i90Var = (i90) wz2Var;
        ar7Var.a(c, i90Var.b);
        ar7Var.a(d, i90Var.c);
        ar7Var.g(e, i90Var.d);
    }
}
