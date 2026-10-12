package ab;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
