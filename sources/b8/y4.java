package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y4 implements ma.d {
    public static final y4 a = new y4();
    public static final ma.c b = new ma.c("imageFormat", k2.p1.o(a1.g.w(e0.class, new z(1))));
    public static final ma.c c = new ma.c("originalImageSize", k2.p1.o(a1.g.w(e0.class, new z(2))));
    public static final ma.c d = new ma.c("compressedImageSize", k2.p1.o(a1.g.w(e0.class, new z(3))));
    public static final ma.c e = new ma.c("isOdmlImage", k2.p1.o(a1.g.w(e0.class, new z(4))));

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ya yaVar = (ya) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(b, yaVar.a);
        eVar.a(c, yaVar.b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
