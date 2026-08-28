package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char i9 = aVar.i();
        if (i9 == 0) {
            lVar.m(this);
            aVar.a();
            eVar.c.append((char) 65533);
        } else if (i9 == '-') {
            lVar.a(b2.g0);
        } else {
            if (i9 != 65535) {
                eVar.c.append(aVar.g('-', 0));
                return;
            }
            lVar.l(this);
            lVar.i();
            lVar.c = b2.a;
        }
    }
}
