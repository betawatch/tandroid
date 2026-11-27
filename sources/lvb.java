// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum lvb extends rwb {
    public lvb() {
        super("SelfClosingStartTag", 41);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.i.l = true;
            bubVar.k();
            bubVar.c = mubVar;
        } else if (d == 65535) {
            bubVar.l(this);
            bubVar.c = mubVar;
        } else {
            bubVar.m(this);
            ik1Var.q();
            bubVar.c = rwb.X;
        }
    }
}
