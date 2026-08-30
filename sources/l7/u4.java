package l7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u4 implements u9.d {
    public static final u4 a = new u4();
    public static final u9.c b = new u9.c("detectorOptions", vh.v2.h(kh.a2.o(h0.class, new e0(1))));
    public static final u9.c c = new u9.c("errorCodes", vh.v2.h(kh.a2.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("totalInitializationMs", vh.v2.h(kh.a2.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("loggingInitializationMs", vh.v2.h(kh.a2.o(h0.class, new e0(4))));
    public static final u9.c f = new u9.c("otherErrors", vh.v2.h(kh.a2.o(h0.class, new e0(5))));

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
