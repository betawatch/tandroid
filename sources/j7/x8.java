package j7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x8 implements q9.d {
    public static final x8 a = new x8();
    public static final q9.c b = new q9.c("isForegroundConfidenceMaskEnabled", ta.b.g(j3.r0.r(w.class, new s(1))));
    public static final q9.c c = new q9.c("isForegroundBitmapEnabled", ta.b.g(j3.r0.r(w.class, new s(2))));
    public static final q9.c d = new q9.c("isMultipleSubjectsEnabled", ta.b.g(j3.r0.r(w.class, new s(3))));
    public static final q9.c e = new q9.c("isSubjectConfidenceMaskEnabled", ta.b.g(j3.r0.r(w.class, new s(4))));
    public static final q9.c f = new q9.c("isSubjectBitmapEnabled", ta.b.g(j3.r0.r(w.class, new s(5))));

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, veVar.a);
        eVar.g(c, veVar.b);
        eVar.g(d, veVar.c);
        eVar.g(e, veVar.d);
        eVar.g(f, veVar.e);
    }
}
