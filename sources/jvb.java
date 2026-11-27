// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum jvb extends rwb {
    public jvb() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        String h = ik1Var.h(rwb.I0);
        if (h.length() > 0) {
            bubVar.i.w(h);
        }
        char d = ik1Var.d();
        if (d == 0) {
            bubVar.m(this);
            bubVar.i.v((char) 65533);
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '`') {
                mub mubVar = rwb.a;
                if (d == 65535) {
                    bubVar.l(this);
                    bubVar.c = mubVar;
                    return;
                }
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    if (d == '&') {
                        int[] c = bubVar.c('>', true);
                        wtb wtbVar = bubVar.i;
                        if (c != null) {
                            wtbVar.x(c);
                            return;
                        } else {
                            wtbVar.v('&');
                            return;
                        }
                    }
                    if (d != '\'') {
                        switch (d) {
                            case jn7.w0 /* 60 */:
                            case jn7.x0 /* 61 */:
                                break;
                            case jn7.y0 /* 62 */:
                                bubVar.k();
                                bubVar.c = mubVar;
                                break;
                            default:
                                bubVar.i.v(d);
                                break;
                        }
                        return;
                    }
                }
            }
            bubVar.m(this);
            bubVar.i.v(d);
            return;
        }
        bubVar.c = rwb.X;
    }
}
