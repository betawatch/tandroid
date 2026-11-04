package ad;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum q0 extends c2 {
    public q0() {
        super("BeforeAttributeValue", 36);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        u0 u0Var = c2.d0;
        if (d == 0) {
            mVar.m(this);
            mVar.i.e((char) 65533);
            mVar.c = u0Var;
            return;
        }
        if (d != ' ') {
            if (d == '\"') {
                mVar.c = c2.b0;
                return;
            }
            if (d != '`') {
                x xVar = c2.a;
                if (d == 65535) {
                    mVar.l(this);
                    mVar.k();
                    mVar.c = xVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                if (d == '&') {
                    aVar.q();
                    mVar.c = u0Var;
                    return;
                }
                if (d == '\'') {
                    mVar.c = c2.c0;
                    return;
                }
                switch (d) {
                    case hs.x0 /* 60 */:
                    case hs.y0 /* 61 */:
                        break;
                    case hs.z0 /* 62 */:
                        mVar.m(this);
                        mVar.k();
                        mVar.c = xVar;
                        break;
                    default:
                        aVar.q();
                        mVar.c = u0Var;
                        break;
                }
                return;
            }
            mVar.m(this);
            mVar.i.e(d);
            mVar.c = u0Var;
        }
    }
}
