package ab;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class f implements ja.d {
    public static final f a = new f();
    public static final ja.c b = ja.c.c("processName");
    public static final ja.c c = ja.c.c("pid");
    public static final ja.c d = ja.c.c("importance");
    public static final ja.c e = ja.c.c("defaultProcess");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        q qVar = (q) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, qVar.a);
        eVar.g(c, qVar.b);
        eVar.g(d, qVar.c);
        eVar.a(e, qVar.d);
    }
}
