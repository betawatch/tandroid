package dd;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
