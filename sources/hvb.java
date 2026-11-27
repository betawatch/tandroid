// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum hvb extends rwb {
    public hvb() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        String g = ik1Var.g(rwb.F0);
        int length = g.length();
        wtb wtbVar = bubVar.i;
        if (length > 0) {
            wtbVar.w(g);
        } else {
            wtbVar.j = true;
        }
        char d = ik1Var.d();
        if (d == 0) {
            bubVar.m(this);
            bubVar.i.v((char) 65533);
            return;
        }
        if (d == 65535) {
            bubVar.l(this);
            bubVar.c = rwb.a;
            return;
        }
        if (d != '&') {
            if (d != '\'') {
                bubVar.i.v(d);
                return;
            } else {
                bubVar.c = rwb.e0;
                return;
            }
        }
        int[] c = bubVar.c('\'', true);
        wtb wtbVar2 = bubVar.i;
        if (c != null) {
            wtbVar2.x(c);
        } else {
            wtbVar2.v('&');
        }
    }
}
