package fd;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public enum s0 extends a2 {
    public s0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.H0);
        if (h.length() > 0) {
            kVar.i.f(h);
        }
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            kVar.i.e((char) 65533);
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '`') {
                v vVar = a2.a;
                if (d == 65535) {
                    kVar.l(this);
                    kVar.c = vVar;
                    return;
                }
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    if (d == '&') {
                        int[] c10 = kVar.c('>', true);
                        if (c10 != null) {
                            kVar.i.g(c10);
                            return;
                        } else {
                            kVar.i.e('&');
                            return;
                        }
                    }
                    if (d != '\'') {
                        switch (d) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                kVar.k();
                                kVar.c = vVar;
                                break;
                            default:
                                kVar.i.e(d);
                                break;
                        }
                        return;
                    }
                }
            }
            kVar.m(this);
            kVar.i.e(d);
            return;
        }
        kVar.c = a2.W;
    }
}
