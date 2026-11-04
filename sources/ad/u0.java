package ad;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum u0 extends c2 {
    public u0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        String h = aVar.h(c2.I0);
        if (h.length() > 0) {
            mVar.i.f(h);
        }
        char d = aVar.d();
        if (d == 0) {
            mVar.m(this);
            mVar.i.e((char) 65533);
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '`') {
                x xVar = c2.a;
                if (d == 65535) {
                    mVar.l(this);
                    mVar.c = xVar;
                    return;
                }
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    if (d == '&') {
                        int[] c2 = mVar.c('>', true);
                        if (c2 != null) {
                            mVar.i.g(c2);
                            return;
                        } else {
                            mVar.i.e('&');
                            return;
                        }
                    }
                    if (d != '\'') {
                        switch (d) {
                            case hs.x0 /* 60 */:
                            case hs.y0 /* 61 */:
                                break;
                            case hs.z0 /* 62 */:
                                mVar.k();
                                mVar.c = xVar;
                                break;
                            default:
                                mVar.i.e(d);
                                break;
                        }
                        return;
                    }
                }
            }
            mVar.m(this);
            mVar.i.e(d);
            return;
        }
        mVar.c = c2.X;
    }
}
