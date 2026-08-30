package k9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a implements u9.d {
    public static final a a = new a();
    public static final u9.c b = u9.c.c("arch");
    public static final u9.c c = u9.c.c("libraryName");
    public static final u9.c d = u9.c.c("buildId");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        c0 c0Var = (c0) ((f1) obj);
        eVar.e(b, c0Var.a);
        eVar.e(c, c0Var.b);
        eVar.e(d, c0Var.c);
    }
}
