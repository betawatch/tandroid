// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gie implements zq7 {
    public static final gie a = new gie();
    public static final sa4 b = new sa4("imageFormat", c00.n(xnb.p(xmd.class, new skd(1))));
    public static final sa4 c = new sa4("originalImageSize", c00.n(xnb.p(xmd.class, new skd(2))));
    public static final sa4 d = new sa4("compressedImageSize", c00.n(xnb.p(xmd.class, new skd(3))));
    public static final sa4 e = new sa4("isOdmlImage", c00.n(xnb.p(xmd.class, new skd(4))));

    @Override // l34
    public final void a(Object obj, Object obj2) {
        g8f g8fVar = (g8f) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, g8fVar.a);
        ar7Var.a(c, g8fVar.b);
        ar7Var.a(d, null);
        ar7Var.a(e, null);
    }
}
