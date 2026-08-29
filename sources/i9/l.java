package i9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l implements s9.d {
    public static final l a = new l();
    public static final s9.c b = s9.c.c("baseAddress");
    public static final s9.c c = s9.c.c("size");
    public static final s9.c d = s9.c.c("name");
    public static final s9.c e = s9.c.c("uuid");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        s9.e eVar = (s9.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.c(b, o0Var.a);
        eVar.c(c, o0Var.b);
        eVar.e(d, o0Var.c);
        String str = o0Var.d;
        eVar.e(e, str != null ? str.getBytes(e2.a) : null);
    }
}
