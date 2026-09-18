package dd;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public enum p0 extends b2 {
    public p0() {
        super("BeforeAttributeValue", 36);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        t0 t0Var = b2.c0;
        if (d == 0) {
            lVar.m(this);
            lVar.i.e((char) 65533);
            lVar.c = t0Var;
            return;
        }
        if (d != ' ') {
            if (d == '\"') {
                lVar.c = b2.a0;
                return;
            }
            if (d != '`') {
                w wVar = b2.a;
                if (d == 65535) {
                    lVar.l(this);
                    lVar.k();
                    lVar.c = wVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                if (d == '&') {
                    aVar.q();
                    lVar.c = t0Var;
                    return;
                }
                if (d == '\'') {
                    lVar.c = b2.b0;
                    return;
                }
                switch (d) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        lVar.m(this);
                        lVar.k();
                        lVar.c = wVar;
                        break;
                    default:
                        aVar.q();
                        lVar.c = t0Var;
                        break;
                }
                return;
            }
            lVar.m(this);
            lVar.i.e(d);
            lVar.c = t0Var;
        }
    }
}
