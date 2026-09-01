package n7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c8 implements u9.d {
    public static final c8 a = new c8();
    public static final u9.c b = new u9.c("inferenceCommonLogEvent", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c c = new u9.c("imageInfo", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("subjectSegmenterOptions", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("subjectInfos", w.c.h(l.d.p(w.class, new s(4))));
    public static final u9.c f = new u9.c("qualityScores", w.c.h(l.d.p(w.class, new s(5))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        fe feVar = (fe) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, feVar.a);
        eVar.e(c, feVar.b);
        eVar.e(d, feVar.c);
        eVar.e(e, feVar.d);
        eVar.e(f, feVar.e);
    }
}
