package bb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f implements ka.d {
    public static final f a = new f();
    public static final ka.c b = ka.c.c("processName");
    public static final ka.c c = ka.c.c("pid");
    public static final ka.c d = ka.c.c("importance");
    public static final ka.c e = ka.c.c("defaultProcess");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        q qVar = (q) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, qVar.a);
        eVar.e(c, qVar.b);
        eVar.e(d, qVar.c);
        eVar.d(e, qVar.d);
    }
}
