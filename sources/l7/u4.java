package l7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u4 implements u9.d {
    public static final u4 a = new u4();
    public static final u9.c b = new u9.c("detectorOptions", vh.w2.h(kf.k0.o(h0.class, new e0(1))));
    public static final u9.c c = new u9.c("errorCodes", vh.w2.h(kf.k0.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("totalInitializationMs", vh.w2.h(kf.k0.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("loggingInitializationMs", vh.w2.h(kf.k0.o(h0.class, new e0(4))));
    public static final u9.c f = new u9.c("otherErrors", vh.w2.h(kf.k0.o(h0.class, new e0(5))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        m8 m8Var = (m8) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, m8Var.a);
        eVar.e(c, m8Var.b);
        eVar.e(d, null);
        eVar.e(e, null);
        eVar.e(f, null);
    }
}
