package n7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k4 implements u9.d {
    public static final k4 a = new k4();
    public static final u9.c b = new u9.c("maxMs", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c c = new u9.c("minMs", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("avgMs", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("firstQuartileMs", w.c.h(l.d.p(w.class, new s(4))));
    public static final u9.c f = new u9.c("medianMs", w.c.h(l.d.p(w.class, new s(5))));
    public static final u9.c g = new u9.c("thirdQuartileMs", w.c.h(l.d.p(w.class, new s(6))));

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
