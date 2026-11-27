// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k60 implements zq7 {
    public static final k60 a = new k60();
    public static final sa4 b = sa4.c("processName");
    public static final sa4 c = sa4.c("pid");
    public static final sa4 d = sa4.c("importance");
    public static final sa4 e = sa4.c("defaultProcess");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        rz2 rz2Var = (rz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((d90) rz2Var).a);
        d90 d90Var = (d90) rz2Var;
        ar7Var.e(c, d90Var.b);
        ar7Var.e(d, d90Var.c);
        ar7Var.d(e, d90Var.d);
    }
}
