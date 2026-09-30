package le;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class j {
    public final g a;
    public final n b = new n(0.0f);
    public final n c = new n(0.0f);
    public final n d = new n(0.0f);
    public final n e = new n(0.0f);
    public final n f = new n(0.0f);
    public final n g = new n(0.0f);

    public j(k kVar, g gVar) {
        this.a = gVar;
    }

    public static void a(j jVar, int i10, boolean z10) {
        n nVar = jVar.c;
        n nVar2 = jVar.b;
        if (z10) {
            nVar2.c = i10;
            nVar.c = i10 > 0 ? 1.0f : 0.0f;
        } else {
            nVar2.d(i10);
            nVar.d(i10 > 0 ? 1.0f : 0.0f);
        }
    }
}
