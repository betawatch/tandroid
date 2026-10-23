package fd;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
