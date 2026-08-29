package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // nc.b2
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
                        int[] c3 = lVar.c('>', true);
                        if (c3 != null) {
                            lVar.i.h(c3);
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
