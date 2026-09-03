package l7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t4 implements u9.d {
    public static final t4 a = new t4();
    public static final u9.c b = new u9.c("inferenceCommonLogEvent", vh.w2.h(kf.k0.o(h0.class, new e0(1))));
    public static final u9.c c = new u9.c("options", vh.w2.h(kf.k0.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("imageInfo", vh.w2.h(kf.k0.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("labelCount", vh.w2.h(kf.k0.o(h0.class, new e0(4))));
    public static final u9.c f = new u9.c("highestConfidence", vh.w2.h(kf.k0.o(h0.class, new e0(5))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        l8 l8Var = (l8) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, l8Var.a);
        eVar.e(c, l8Var.b);
        eVar.e(d, l8Var.c);
        eVar.e(e, null);
        eVar.e(f, null);
    }
}
