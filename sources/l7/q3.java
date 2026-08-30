package l7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class q3 implements u9.d {
    public static final q3 a = new q3();
    public static final u9.c b = new u9.c("imageFormat", vh.v2.h(kh.a2.o(h0.class, new e0(1))));
    public static final u9.c c = new u9.c("originalImageSize", vh.v2.h(kh.a2.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("compressedImageSize", vh.v2.h(kh.a2.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("isOdmlImage", vh.v2.h(kh.a2.o(h0.class, new e0(4))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        k7 k7Var = (k7) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, k7Var.a);
        eVar.e(c, k7Var.b);
        eVar.e(d, null);
        eVar.e(e, null);
    }
}
