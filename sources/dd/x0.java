package dd;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.n.f();
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
