package l7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class y1 implements u9.d {
    public static final y1 a = new y1();
    public static final u9.c b = new u9.c("logEventKey", w.c.h(l.d.o(h0.class, new e0(1))));
    public static final u9.c c = new u9.c("eventCount", w.c.h(l.d.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("inferenceDurationStats", w.c.h(l.d.o(h0.class, new e0(3))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        y0 y0Var = (y0) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, y0Var.a);
        eVar.e(c, y0Var.b);
        eVar.e(d, y0Var.c);
    }
}
