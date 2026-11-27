// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class e60 implements zq7 {
    public static final e60 a = new e60();
    public static final sa4 b = sa4.c("baseAddress");
    public static final sa4 c = sa4.c("size");
    public static final sa4 d = sa4.c("name");
    public static final sa4 e = sa4.c("uuid");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        lz2 lz2Var = (lz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.g(b, ((x80) lz2Var).a);
        x80 x80Var = (x80) lz2Var;
        ar7Var.g(c, x80Var.b);
        ar7Var.a(d, x80Var.c);
        String str = x80Var.d;
        ar7Var.a(e, str != null ? str.getBytes(c03.a) : null);
    }
}
