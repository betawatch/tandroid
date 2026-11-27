// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hae implements zq7 {
    public static final hae a = new hae();
    public static final sa4 b = new sa4("imageFormat", c00.n(xnb.q(bpd.class, new tnd(1))));
    public static final sa4 c = new sa4("originalImageSize", c00.n(xnb.q(bpd.class, new tnd(2))));
    public static final sa4 d = new sa4("compressedImageSize", c00.n(xnb.q(bpd.class, new tnd(3))));
    public static final sa4 e = new sa4("isOdmlImage", c00.n(xnb.q(bpd.class, new tnd(4))));

    @Override // l34
    public final void a(Object obj, Object obj2) {
        kve kveVar = (kve) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, kveVar.a);
        ar7Var.a(c, kveVar.b);
        ar7Var.a(d, null);
        ar7Var.a(e, null);
    }
}
