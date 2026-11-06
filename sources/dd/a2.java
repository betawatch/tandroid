package dd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
