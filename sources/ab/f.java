package ab;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
