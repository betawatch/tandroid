package dd;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public enum s0 extends b2 {
    public s0() {
        super("Rcdata", 2);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char i7 = aVar.i();
        if (i7 == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else {
            if (i7 == '&') {
                lVar.a(b2.d);
                return;
            }
            if (i7 == '<') {
                lVar.a(b2.s);
            } else if (i7 != 65535) {
                lVar.h(aVar.g('&', '<', 0));
            } else {
                lVar.g(new g());
            }
        }
    }
}
