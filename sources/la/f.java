package la;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f implements u9.d {
    public static final f a = new f();
    public static final u9.c b = u9.c.c("processName");
    public static final u9.c c = u9.c.c("pid");
    public static final u9.c d = u9.c.c("importance");
    public static final u9.c e = u9.c.c("defaultProcess");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        p pVar = (p) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, pVar.a);
        eVar.a(c, pVar.b);
        eVar.a(d, pVar.c);
        eVar.d(e, pVar.d);
    }
}
