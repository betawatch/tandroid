package la;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
