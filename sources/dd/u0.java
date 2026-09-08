package dd;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public enum u0 extends b2 {
    public u0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = b2.W;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            lVar.c = m0Var;
            return;
        }
        if (d == '/') {
            lVar.c = b2.e0;
            return;
        }
        w wVar = b2.a;
        if (d == '>') {
            lVar.k();
            lVar.c = wVar;
        } else if (d == 65535) {
            lVar.l(this);
            lVar.c = wVar;
        } else {
            lVar.m(this);
            aVar.q();
            lVar.c = m0Var;
        }
    }
}
