package gd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public enum z1 extends a2 {
    public z1() {
        super("EndTagOpen", 8);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        boolean j10 = aVar.j();
        v vVar = a2.a;
        if (j10) {
            kVar.l(this);
            kVar.h("</");
            kVar.c = vVar;
        } else if (aVar.o()) {
            kVar.d(false);
            kVar.c = a2.r;
        } else if (aVar.m('>')) {
            kVar.m(this);
            kVar.a(vVar);
        } else {
            kVar.m(this);
            kVar.a(a2.f0);
        }
    }
}
