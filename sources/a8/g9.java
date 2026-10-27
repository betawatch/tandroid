package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g9 implements ka.d {
    public static final g9 a = new g9();
    public static final ka.c b = new ka.c("isForegroundConfidenceMaskEnabled", ic.a.m(a1.g.x(e0.class, new z(1))));
    public static final ka.c c = new ka.c("isForegroundBitmapEnabled", ic.a.m(a1.g.x(e0.class, new z(2))));
    public static final ka.c d = new ka.c("isMultipleSubjectsEnabled", ic.a.m(a1.g.x(e0.class, new z(3))));
    public static final ka.c e = new ka.c("isSubjectConfidenceMaskEnabled", ic.a.m(a1.g.x(e0.class, new z(4))));
    public static final ka.c f = new ka.c("isSubjectBitmapEnabled", ic.a.m(a1.g.x(e0.class, new z(5))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ef efVar = (ef) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, efVar.a);
        eVar.a(c, efVar.b);
        eVar.a(d, efVar.c);
        eVar.a(e, efVar.d);
        eVar.a(f, efVar.e);
    }
}
