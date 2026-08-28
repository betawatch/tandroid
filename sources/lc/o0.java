package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum o0 extends b2 {
    public o0() {
        super("AfterAttributeName", 35);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = b2.T;
        if (d == 0) {
            lVar.m(this);
            lVar.i.e((char) 65533);
            lVar.c = n0Var;
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    lVar.c = b2.a0;
                    return;
                }
                w wVar = b2.a;
                if (d == 65535) {
                    lVar.l(this);
                    lVar.c = wVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                switch (d) {
                    case '<':
                        break;
                    case '=':
                        lVar.c = b2.V;
                        break;
                    case '>':
                        lVar.k();
                        lVar.c = wVar;
                        break;
                    default:
                        lVar.i.k();
                        aVar.q();
                        lVar.c = n0Var;
                        break;
                }
                return;
            }
            lVar.m(this);
            lVar.i.k();
            lVar.i.e(d);
            lVar.c = n0Var;
        }
    }
}
