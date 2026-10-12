package fd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
