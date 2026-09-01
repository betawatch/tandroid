package la;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
