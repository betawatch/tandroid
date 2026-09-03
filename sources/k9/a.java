package k9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
