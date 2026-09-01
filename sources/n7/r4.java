package n7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class r4 implements u9.d {
    public static final r4 a = new r4();
    public static final u9.c b = new u9.c("imageFormat", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c c = new u9.c("originalImageSize", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("compressedImageSize", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("isOdmlImage", w.c.h(l.d.p(w.class, new s(4))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        sa saVar = (sa) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, saVar.a);
        eVar.e(c, saVar.b);
        eVar.e(d, null);
        eVar.e(e, null);
    }
}
