package dd;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public enum a2 extends b2 {
    public a2() {
        super("EndTagOpen", 8);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        boolean j3 = aVar.j();
        w wVar = b2.a;
        if (j3) {
            lVar.l(this);
            lVar.h("</");
            lVar.c = wVar;
        } else if (aVar.o()) {
            lVar.d(false);
            lVar.c = b2.r;
        } else if (aVar.m('>')) {
            lVar.m(this);
            lVar.a(wVar);
        } else {
            lVar.m(this);
            lVar.a(b2.f0);
        }
    }
}
