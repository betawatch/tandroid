package dd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public enum u0 extends b2 {
    public u0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = b2.X;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            lVar.c = m0Var;
            return;
        }
        if (d == '/') {
            lVar.c = b2.f0;
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
