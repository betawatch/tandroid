package gd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public enum y1 extends a2 {
    public y1() {
        super("TagOpen", 7);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == '!') {
            kVar.a(a2.g0);
            return;
        }
        if (i10 == '/') {
            kVar.a(a2.n);
            return;
        }
        if (i10 == '?') {
            kVar.a(a2.f0);
            return;
        }
        if (aVar.o()) {
            kVar.d(true);
            kVar.c = a2.r;
        } else {
            kVar.m(this);
            kVar.f('<');
            kVar.c = a2.a;
        }
    }
}
