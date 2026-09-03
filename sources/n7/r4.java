package n7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r4 implements u9.d {
    public static final r4 a = new r4();
    public static final u9.c b = new u9.c("imageFormat", vh.w2.h(kf.k0.p(w.class, new s(1))));
    public static final u9.c c = new u9.c("originalImageSize", vh.w2.h(kf.k0.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("compressedImageSize", vh.w2.h(kf.k0.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("isOdmlImage", vh.w2.h(kf.k0.p(w.class, new s(4))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        sa saVar = (sa) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, saVar.a);
        eVar.e(c, saVar.b);
        eVar.e(d, null);
        eVar.e(e, null);
    }
}
