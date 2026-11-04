package ad;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum p0 extends c2 {
    public p0() {
        super("AfterAttributeName", 35);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        o0 o0Var = c2.Y;
        if (d == 0) {
            mVar.m(this);
            mVar.i.d((char) 65533);
            mVar.c = o0Var;
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    mVar.c = c2.f0;
                    return;
                }
                x xVar = c2.a;
                if (d == 65535) {
                    mVar.l(this);
                    mVar.c = xVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                switch (d) {
                    case hs.x0 /* 60 */:
                        break;
                    case hs.y0 /* 61 */:
                        mVar.c = c2.a0;
                        break;
                    case hs.z0 /* 62 */:
                        mVar.k();
                        mVar.c = xVar;
                        break;
                    default:
                        mVar.i.j();
                        aVar.q();
                        mVar.c = o0Var;
                        break;
                }
                return;
            }
            mVar.m(this);
            mVar.i.j();
            mVar.i.d(d);
            mVar.c = o0Var;
        }
    }
}
