package n7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class x8 implements u9.d {
    public static final x8 a = new x8();
    public static final u9.c b = new u9.c("isForegroundConfidenceMaskEnabled", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c c = new u9.c("isForegroundBitmapEnabled", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("isMultipleSubjectsEnabled", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("isSubjectConfidenceMaskEnabled", w.c.h(l.d.p(w.class, new s(4))));
    public static final u9.c f = new u9.c("isSubjectBitmapEnabled", w.c.h(l.d.p(w.class, new s(5))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, weVar.a);
        eVar.e(c, weVar.b);
        eVar.e(d, weVar.c);
        eVar.e(e, weVar.d);
        eVar.e(f, weVar.e);
    }
}
