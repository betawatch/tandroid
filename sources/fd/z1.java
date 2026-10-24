package fd;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public enum z1 extends a2 {
    public z1() {
        super("EndTagOpen", 8);
    }

    @Override // fd.a2
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
