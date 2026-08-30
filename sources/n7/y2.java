package n7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class y2 implements u9.d {
    public static final y2 a = new y2();
    public static final u9.c b = new u9.c("logEventKey", vh.v2.h(kh.a2.p(w.class, new s(1))));
    public static final u9.c c = new u9.c("eventCount", vh.v2.h(kh.a2.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("inferenceDurationStats", vh.v2.h(kh.a2.p(w.class, new s(3))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, j1Var.a);
        eVar.e(c, j1Var.b);
        eVar.e(d, j1Var.c);
    }
}
