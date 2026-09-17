package dd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.H0);
        if (h.length() > 0) {
            lVar.i.l(h);
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            lVar.i.j((char) 65533);
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
                            lVar.i.m(c10);
                            return;
                        } else {
                            lVar.i.j('&');
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
                                lVar.i.j(d);
                                break;
                        }
                        return;
                    }
                }
            }
            lVar.m(this);
            lVar.i.j(d);
            return;
        }
        lVar.c = b2.W;
    }
}
