package l7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
