package n7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class x8 implements u9.d {
    public static final x8 a = new x8();
    public static final u9.c b = new u9.c("isForegroundConfidenceMaskEnabled", vh.v2.h(kh.a2.p(w.class, new s(1))));
    public static final u9.c c = new u9.c("isForegroundBitmapEnabled", vh.v2.h(kh.a2.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("isMultipleSubjectsEnabled", vh.v2.h(kh.a2.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("isSubjectConfidenceMaskEnabled", vh.v2.h(kh.a2.p(w.class, new s(4))));
    public static final u9.c f = new u9.c("isSubjectBitmapEnabled", vh.v2.h(kh.a2.p(w.class, new s(5))));

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
