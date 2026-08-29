package l7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k4 implements s9.d {
    public static final k4 a = new k4();
    public static final s9.c b = new s9.c("maxMs", u3.c.h(j7.l1.q(w.class, new s(1))));
    public static final s9.c c = new s9.c("minMs", u3.c.h(j7.l1.q(w.class, new s(2))));
    public static final s9.c d = new s9.c("avgMs", u3.c.h(j7.l1.q(w.class, new s(3))));
    public static final s9.c e = new s9.c("firstQuartileMs", u3.c.h(j7.l1.q(w.class, new s(4))));
    public static final s9.c f = new s9.c("medianMs", u3.c.h(j7.l1.q(w.class, new s(5))));
    public static final s9.c g = new s9.c("thirdQuartileMs", u3.c.h(j7.l1.q(w.class, new s(6))));

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, maVar.a);
        eVar.e(c, maVar.b);
        eVar.e(d, maVar.c);
        eVar.e(e, maVar.d);
        eVar.e(f, maVar.e);
        eVar.e(g, maVar.f);
    }
}
