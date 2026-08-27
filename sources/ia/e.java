package ia;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e implements r9.d {
    public static final e a = new e();
    public static final r9.c b = r9.c.c("performance");
    public static final r9.c c = r9.c.c("crashlytics");
    public static final r9.c d = r9.c.c("sessionSamplingRate");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, jVar.a);
        eVar.a(c, jVar.b);
        eVar.e(d, jVar.c);
    }
}
