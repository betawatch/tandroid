package l7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class y1 implements u9.d {
    public static final y1 a = new y1();
    public static final u9.c b = new u9.c("logEventKey", vh.w2.h(kf.k0.o(h0.class, new e0(1))));
    public static final u9.c c = new u9.c("eventCount", vh.w2.h(kf.k0.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("inferenceDurationStats", vh.w2.h(kf.k0.o(h0.class, new e0(3))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        y0 y0Var = (y0) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, y0Var.a);
        eVar.e(c, y0Var.b);
        eVar.e(d, y0Var.c);
    }
}
