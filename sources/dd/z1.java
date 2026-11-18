package dd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
