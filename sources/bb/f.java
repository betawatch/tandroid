package bb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
