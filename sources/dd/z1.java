package dd;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public enum z1 extends b2 {
    public z1() {
        super("TagOpen", 7);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == '!') {
            lVar.a(b2.g0);
            return;
        }
        if (i10 == '/') {
            lVar.a(b2.n);
            return;
        }
        if (i10 == '?') {
            lVar.a(b2.f0);
            return;
        }
        if (aVar.o()) {
            lVar.d(true);
            lVar.c = b2.r;
        } else {
            lVar.m(this);
            lVar.f('<');
            lVar.c = b2.a;
        }
    }
}
