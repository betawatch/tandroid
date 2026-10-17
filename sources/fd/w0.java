package fd;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.n.b();
            kVar.c = a2.h0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.c = a2.n0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.c = a2.D0;
        } else {
            kVar.m(this);
            kVar.a(a2.f0);
        }
    }
}
