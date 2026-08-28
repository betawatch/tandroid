package ha;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f implements q9.d {
    public static final f a = new f();
    public static final q9.c b = q9.c.c("processName");
    public static final q9.c c = q9.c.c("pid");
    public static final q9.c d = q9.c.c("importance");
    public static final q9.c e = q9.c.c("defaultProcess");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        q qVar = (q) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, qVar.a);
        eVar.c(c, qVar.b);
        eVar.c(d, qVar.c);
        eVar.a(e, qVar.d);
    }
}
