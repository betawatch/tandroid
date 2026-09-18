package dd;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.n.b();
            lVar.c = b2.h0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.c = b2.n0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.c = b2.D0;
        } else {
            lVar.m(this);
            lVar.a(b2.f0);
        }
    }
}
