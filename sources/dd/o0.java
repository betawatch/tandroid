package dd;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public enum o0 extends b2 {
    public o0() {
        super("AfterAttributeName", 35);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = b2.X;
        if (d == 0) {
            lVar.m(this);
            lVar.i.d((char) 65533);
            lVar.c = n0Var;
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    lVar.c = b2.e0;
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
                        lVar.c = b2.Z;
                        break;
                    case '>':
                        lVar.k();
                        lVar.c = wVar;
                        break;
                    default:
                        lVar.i.j();
                        aVar.q();
                        lVar.c = n0Var;
                        break;
                }
                return;
            }
            lVar.m(this);
            lVar.i.j();
            lVar.i.d(d);
            lVar.c = n0Var;
        }
    }
}
