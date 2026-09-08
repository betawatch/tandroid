package dd;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public enum z extends b2 {
    public z() {
        super("ScriptDataEscaped", 21);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.c = b2.a;
            return;
        }
        char i10 = aVar.i();
        if (i10 == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else if (i10 == '-') {
            lVar.f('-');
            lVar.a(b2.L);
        } else if (i10 != '<') {
            lVar.h(aVar.g('-', '<', 0));
        } else {
            lVar.a(b2.N);
        }
    }
}
