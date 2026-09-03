package n7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k4 implements u9.d {
    public static final k4 a = new k4();
    public static final u9.c b = new u9.c("maxMs", vh.w2.h(kf.k0.p(w.class, new s(1))));
    public static final u9.c c = new u9.c("minMs", vh.w2.h(kf.k0.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("avgMs", vh.w2.h(kf.k0.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("firstQuartileMs", vh.w2.h(kf.k0.p(w.class, new s(4))));
    public static final u9.c f = new u9.c("medianMs", vh.w2.h(kf.k0.p(w.class, new s(5))));
    public static final u9.c g = new u9.c("thirdQuartileMs", vh.w2.h(kf.k0.p(w.class, new s(6))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, maVar.a);
        eVar.e(c, maVar.b);
        eVar.e(d, maVar.c);
        eVar.e(e, maVar.d);
        eVar.e(f, maVar.e);
        eVar.e(g, maVar.f);
    }
}
