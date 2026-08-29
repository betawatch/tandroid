package l7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y2 implements s9.d {
    public static final y2 a = new y2();
    public static final s9.c b = new s9.c("logEventKey", u3.c.h(j7.l1.q(w.class, new s(1))));
    public static final s9.c c = new s9.c("eventCount", u3.c.h(j7.l1.q(w.class, new s(2))));
    public static final s9.c d = new s9.c("inferenceDurationStats", u3.c.h(j7.l1.q(w.class, new s(3))));

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, j1Var.a);
        eVar.e(c, j1Var.b);
        eVar.e(d, j1Var.c);
    }
}
