package ad;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum o0 extends c2 {
    public o0() {
        super("AttributeName", 34);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        String h = aVar.h(c2.H0);
        k kVar = mVar.i;
        String str = kVar.e;
        if (str != null) {
            h = str.concat(h);
        }
        kVar.e = h;
        char d = aVar.d();
        if (d == 0) {
            mVar.m(this);
            mVar.i.d((char) 65533);
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
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
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
                            mVar.i.d(d);
                            break;
                    }
                    return;
                }
            }
            mVar.m(this);
            mVar.i.d(d);
            return;
        }
        mVar.c = c2.Z;
    }
}
