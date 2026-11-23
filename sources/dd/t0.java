package dd;

import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                            case ls.x0 /* 60 */:
                            case ls.y0 /* 61 */:
                                break;
                            case ls.z0 /* 62 */:
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
