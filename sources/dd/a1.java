package dd;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char i10 = aVar.i();
        if (i10 == 0) {
            lVar.m(this);
            aVar.a();
            eVar.c.append((char) 65533);
        } else if (i10 == '-') {
            lVar.a(b2.k0);
        } else {
            if (i10 != 65535) {
                eVar.c.append(aVar.g('-', 0));
                return;
            }
            lVar.l(this);
            lVar.i();
            lVar.c = b2.a;
        }
    }
}
