package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.D0);
        if (h.length() > 0) {
            lVar.i.g(h);
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            lVar.i.f((char) 65533);
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
                            lVar.i.h(c10);
                            return;
                        } else {
                            lVar.i.f('&');
                            return;
                        }
                    }
                    if (d != '\'') {
                        switch (d) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                lVar.k();
                                lVar.c = wVar;
                                break;
                            default:
                                lVar.i.f(d);
                                break;
                        }
                        return;
                    }
                }
            }
            lVar.m(this);
            lVar.i.f(d);
            return;
        }
        lVar.c = b2.S;
    }
}
