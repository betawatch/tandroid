package la;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e implements u9.d {
    public static final e a = new e();
    public static final u9.c b = u9.c.c("performance");
    public static final u9.c c = u9.c.c("crashlytics");
    public static final u9.c d = u9.c.c("sessionSamplingRate");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, jVar.a);
        eVar.e(c, jVar.b);
        eVar.c(d, jVar.c);
    }
}
