// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum gvb extends rwb {
    public gvb() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        String g = ik1Var.g(rwb.G0);
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
        if (d == '\"') {
            bubVar.c = rwb.e0;
            return;
        }
        if (d != '&') {
            if (d != 65535) {
                bubVar.i.v(d);
                return;
            } else {
                bubVar.l(this);
                bubVar.c = rwb.a;
                return;
            }
        }
        int[] c = bubVar.c('\"', true);
        wtb wtbVar2 = bubVar.i;
        if (c != null) {
            wtbVar2.x(c);
        } else {
            wtbVar2.v('&');
        }
    }
}
