package dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public enum z1 extends b2 {
    public z1() {
        super("TagOpen", 7);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char i7 = aVar.i();
        if (i7 == '!') {
            lVar.a(b2.h0);
            return;
        }
        if (i7 == '/') {
            lVar.a(b2.n);
            return;
        }
        if (i7 == '?') {
            lVar.a(b2.g0);
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
