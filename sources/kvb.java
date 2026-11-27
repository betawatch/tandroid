// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
