package da;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class n implements na.d {
    public static final n a = new n();
    public static final na.c b = na.c.c("baseAddress");
    public static final na.c c = na.c.c("size");
    public static final na.c d = na.c.c("name");
    public static final na.c e = na.c.c("uuid");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        na.e eVar = (na.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.e(b, x0Var.a);
        eVar.e(c, x0Var.b);
        eVar.a(d, x0Var.c);
        String str = x0Var.d;
        eVar.a(e, str != null ? str.getBytes(u2.a) : null);
    }
}
