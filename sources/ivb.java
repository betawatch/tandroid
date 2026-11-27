// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum ivb extends rwb {
    public ivb() {
        super("Rcdata", 2);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char i = ik1Var.i();
        if (i == 0) {
            bubVar.m(this);
            ik1Var.a();
            bubVar.f((char) 65533);
        } else {
            if (i == '&') {
                bubVar.a(rwb.d);
                return;
            }
            if (i == '<') {
                bubVar.a(rwb.s);
            } else if (i != 65535) {
                bubVar.h(ik1Var.g('&', '<', 0));
            } else {
                bubVar.g(new ttb());
            }
        }
    }
}
