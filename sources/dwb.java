// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum dwb extends rwb {
    public dwb() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            bubVar.c = rwb.x0;
            return;
        }
        if (d == '\"') {
            bubVar.m(this);
            bubVar.c = rwb.A0;
            return;
        }
        if (d == '\'') {
            bubVar.m(this);
            bubVar.c = rwb.B0;
            return;
        }
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.j();
            bubVar.c = mubVar;
        } else if (d != 65535) {
            bubVar.m(this);
            bubVar.c = rwb.D0;
        } else {
            bubVar.l(this);
            bubVar.j();
            bubVar.c = mubVar;
        }
    }
}
