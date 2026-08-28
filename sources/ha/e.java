package ha;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements q9.d {
    public static final e a = new e();
    public static final q9.c b = q9.c.c("performance");
    public static final q9.c c = q9.c.c("crashlytics");
    public static final q9.c d = q9.c.c("sessionSamplingRate");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, jVar.a);
        eVar.g(c, jVar.b);
        eVar.b(d, jVar.c);
    }
}
