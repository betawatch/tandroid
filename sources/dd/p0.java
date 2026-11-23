package dd;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public enum p0 extends b2 {
    public p0() {
        super("BeforeAttributeValue", 36);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        t0 t0Var = b2.d0;
        if (d == 0) {
            lVar.m(this);
            lVar.i.e((char) 65533);
            lVar.c = t0Var;
            return;
        }
        if (d != ' ') {
            if (d == '\"') {
                lVar.c = b2.b0;
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
                    lVar.c = b2.c0;
                    return;
                }
                switch (d) {
                    case ks.x0 /* 60 */:
                    case ks.y0 /* 61 */:
                        break;
                    case ks.z0 /* 62 */:
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
