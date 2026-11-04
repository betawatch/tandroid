package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e9 implements ma.d {
    public static final e9 a = new e9();
    public static final ma.c b = new ma.c("isForegroundConfidenceMaskEnabled", k2.p1.o(a1.g.w(e0.class, new z(1))));
    public static final ma.c c = new ma.c("isForegroundBitmapEnabled", k2.p1.o(a1.g.w(e0.class, new z(2))));
    public static final ma.c d = new ma.c("isMultipleSubjectsEnabled", k2.p1.o(a1.g.w(e0.class, new z(3))));
    public static final ma.c e = new ma.c("isSubjectConfidenceMaskEnabled", k2.p1.o(a1.g.w(e0.class, new z(4))));
    public static final ma.c f = new ma.c("isSubjectBitmapEnabled", k2.p1.o(a1.g.w(e0.class, new z(5))));

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        cf cfVar = (cf) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(b, cfVar.a);
        eVar.a(c, cfVar.b);
        eVar.a(d, cfVar.c);
        eVar.a(e, cfVar.d);
        eVar.a(f, cfVar.e);
    }
}
