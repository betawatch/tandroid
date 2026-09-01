package l7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class l3 implements u9.d {
    public static final l3 a = new l3();
    public static final u9.c b = new u9.c("maxMs", w.c.h(l.d.o(h0.class, new e0(1))));
    public static final u9.c c = new u9.c("minMs", w.c.h(l.d.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("avgMs", w.c.h(l.d.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("firstQuartileMs", w.c.h(l.d.o(h0.class, new e0(4))));
    public static final u9.c f = new u9.c("medianMs", w.c.h(l.d.o(h0.class, new e0(5))));
    public static final u9.c g = new u9.c("thirdQuartileMs", w.c.h(l.d.o(h0.class, new e0(6))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        g7 g7Var = (g7) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, g7Var.a);
        eVar.e(c, g7Var.b);
        eVar.e(d, g7Var.c);
        eVar.e(e, g7Var.d);
        eVar.e(f, g7Var.e);
        eVar.e(g, g7Var.f);
    }
}
