package dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.n.b();
            lVar.c = b2.i0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.c = b2.o0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.c = b2.E0;
        } else {
            lVar.m(this);
            lVar.a(b2.g0);
        }
    }
}
