package ja;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e implements s9.d {
    public static final e a = new e();
    public static final s9.c b = s9.c.c("performance");
    public static final s9.c c = s9.c.c("crashlytics");
    public static final s9.c d = s9.c.c("sessionSamplingRate");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, jVar.a);
        eVar.e(c, jVar.b);
        eVar.a(d, jVar.c);
    }
}
