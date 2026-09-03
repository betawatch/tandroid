package k9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l implements u9.d {
    public static final l a = new l();
    public static final u9.c b = u9.c.c("baseAddress");
    public static final u9.c c = u9.c.c("size");
    public static final u9.c d = u9.c.c("name");
    public static final u9.c e = u9.c.c("uuid");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.b(b, o0Var.a);
        eVar.b(c, o0Var.b);
        eVar.e(d, o0Var.c);
        String str = o0Var.d;
        eVar.e(e, str != null ? str.getBytes(e2.a) : null);
    }
}
