package a8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a5 implements ka.d {
    public static final a5 a = new a5();
    public static final ka.c b = new ka.c("imageFormat", ic.a.m(a1.g.x(e0.class, new z(1))));
    public static final ka.c c = new ka.c("originalImageSize", ic.a.m(a1.g.x(e0.class, new z(2))));
    public static final ka.c d = new ka.c("compressedImageSize", ic.a.m(a1.g.x(e0.class, new z(3))));
    public static final ka.c e = new ka.c("isOdmlImage", ic.a.m(a1.g.x(e0.class, new z(4))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ab abVar = (ab) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, abVar.a);
        eVar.a(c, abVar.b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
