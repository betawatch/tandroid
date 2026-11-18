package dd;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.I0);
        if (h.length() > 0) {
            lVar.i.f(h);
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            lVar.i.e((char) 65533);
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '`') {
                w wVar = b2.a;
                if (d == 65535) {
                    lVar.l(this);
                    lVar.c = wVar;
                    return;
                }
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    if (d == '&') {
                        int[] c10 = lVar.c('>', true);
                        if (c10 != null) {
                            lVar.i.g(c10);
                            return;
                        } else {
                            lVar.i.e('&');
                            return;
                        }
                    }
                    if (d != '\'') {
                        switch (d) {
                            case ks.x0 /* 60 */:
                            case ks.y0 /* 61 */:
                                break;
                            case ks.z0 /* 62 */:
                                lVar.k();
                                lVar.c = wVar;
                                break;
                            default:
                                lVar.i.e(d);
                                break;
                        }
                        return;
                    }
                }
            }
            lVar.m(this);
            lVar.i.e(d);
            return;
        }
        lVar.c = b2.X;
    }
}
