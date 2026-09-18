package dd;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public enum s0 extends b2 {
    public s0() {
        super("Rcdata", 2);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else {
            if (i10 == '&') {
                lVar.a(b2.d);
                return;
            }
            if (i10 == '<') {
                lVar.a(b2.s);
            } else if (i10 != 65535) {
                lVar.h(aVar.g('&', '<', 0));
            } else {
                lVar.g(new g());
            }
        }
    }
}
