package dd;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
