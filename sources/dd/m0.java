package dd;

import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public enum m0 extends b2 {
    public m0() {
        super("BeforeAttributeName", 33);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = b2.Y;
        if (d == 0) {
            lVar.m(this);
            lVar.i.j();
            aVar.q();
            lVar.c = n0Var;
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    lVar.c = b2.f0;
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
                    case ls.x0 /* 60 */:
                    case ls.y0 /* 61 */:
                        break;
                    case ls.z0 /* 62 */:
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
