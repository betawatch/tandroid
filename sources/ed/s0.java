package ed;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public enum s0 extends b2 {
    public s0() {
        super("Rcdata", 2);
    }

    @Override // ed.b2
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
