package i7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p3 implements r9.d {
    public static final p3 a = new p3();
    public static final r9.c b = new r9.c("imageFormat", s3.c.h(i0.a.r(h0.class, new e0(1))));
    public static final r9.c c = new r9.c("originalImageSize", s3.c.h(i0.a.r(h0.class, new e0(2))));
    public static final r9.c d = new r9.c("compressedImageSize", s3.c.h(i0.a.r(h0.class, new e0(3))));
    public static final r9.c e = new r9.c("isOdmlImage", s3.c.h(i0.a.r(h0.class, new e0(4))));

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        j7 j7Var = (j7) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, j7Var.a);
        eVar.a(c, j7Var.b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
