package l7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x8 implements s9.d {
    public static final x8 a = new x8();
    public static final s9.c b = new s9.c("isForegroundConfidenceMaskEnabled", u3.c.h(j7.l1.q(w.class, new s(1))));
    public static final s9.c c = new s9.c("isForegroundBitmapEnabled", u3.c.h(j7.l1.q(w.class, new s(2))));
    public static final s9.c d = new s9.c("isMultipleSubjectsEnabled", u3.c.h(j7.l1.q(w.class, new s(3))));
    public static final s9.c e = new s9.c("isSubjectConfidenceMaskEnabled", u3.c.h(j7.l1.q(w.class, new s(4))));
    public static final s9.c f = new s9.c("isSubjectBitmapEnabled", u3.c.h(j7.l1.q(w.class, new s(5))));

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, veVar.a);
        eVar.e(c, veVar.b);
        eVar.e(d, veVar.c);
        eVar.e(e, veVar.d);
        eVar.e(f, veVar.e);
    }
}
