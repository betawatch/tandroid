package j9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a implements u9.d {
    public static final a a = new a();
    public static final u9.c b = u9.c.c("rolloutId");
    public static final u9.c c = u9.c.c("parameterKey");
    public static final u9.c d = u9.c.c("parameterValue");
    public static final u9.c e = u9.c.c("variantId");
    public static final u9.c f = u9.c.c("templateVersion");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        b bVar = (b) ((n) obj);
        eVar.e(b, bVar.b);
        eVar.e(c, bVar.c);
        eVar.e(d, bVar.d);
        eVar.e(e, bVar.e);
        eVar.b(f, bVar.f);
    }
}
