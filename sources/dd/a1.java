package dd;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char i7 = aVar.i();
        if (i7 == 0) {
            lVar.m(this);
            aVar.a();
            eVar.c.append((char) 65533);
        } else if (i7 == '-') {
            lVar.a(b2.k0);
        } else {
            if (i7 != 65535) {
                eVar.c.append(aVar.g('-', 0));
                return;
            }
            lVar.l(this);
            lVar.i();
            lVar.c = b2.a;
        }
    }
}
