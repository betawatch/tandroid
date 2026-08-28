package h7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p3 implements q9.d {
    public static final p3 a = new p3();
    public static final q9.c b = new q9.c("imageFormat", ta.b.g(e2.c.s(h0.class, new e0(1))));
    public static final q9.c c = new q9.c("originalImageSize", ta.b.g(e2.c.s(h0.class, new e0(2))));
    public static final q9.c d = new q9.c("compressedImageSize", ta.b.g(e2.c.s(h0.class, new e0(3))));
    public static final q9.c e = new q9.c("isOdmlImage", ta.b.g(e2.c.s(h0.class, new e0(4))));

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        j7 j7Var = (j7) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, j7Var.a);
        eVar.g(c, j7Var.b);
        eVar.g(d, null);
        eVar.g(e, null);
    }
}
