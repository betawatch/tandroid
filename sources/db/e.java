package db;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements ma.d {
    public static final e a = new e();
    public static final ma.c b = ma.c.c("performance");
    public static final ma.c c = ma.c.c("crashlytics");
    public static final ma.c d = ma.c.c("sessionSamplingRate");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        k kVar = (k) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(b, kVar.a);
        eVar.a(c, kVar.b);
        eVar.c(d, kVar.c);
    }
}
