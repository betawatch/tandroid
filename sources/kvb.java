// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum kvb extends rwb {
    public kvb() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        cvb cvbVar = rwb.X;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            bubVar.c = cvbVar;
            return;
        }
        if (d == '/') {
            bubVar.c = rwb.f0;
            return;
        }
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.k();
            bubVar.c = mubVar;
        } else if (d == 65535) {
            bubVar.l(this);
            bubVar.c = mubVar;
        } else {
            bubVar.m(this);
            ik1Var.q();
            bubVar.c = cvbVar;
        }
    }
}
