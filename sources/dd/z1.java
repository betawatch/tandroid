package dd;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
