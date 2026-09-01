package l7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class t4 implements u9.d {
    public static final t4 a = new t4();
    public static final u9.c b = new u9.c("inferenceCommonLogEvent", w.c.h(l.d.o(h0.class, new e0(1))));
    public static final u9.c c = new u9.c("options", w.c.h(l.d.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("imageInfo", w.c.h(l.d.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("labelCount", w.c.h(l.d.o(h0.class, new e0(4))));
    public static final u9.c f = new u9.c("highestConfidence", w.c.h(l.d.o(h0.class, new e0(5))));

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
