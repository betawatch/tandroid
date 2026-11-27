// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum lwb extends rwb {
    public lwb() {
        super("BogusDoctype", 65);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.j();
            bubVar.c = mubVar;
        } else {
            if (d != 65535) {
                return;
            }
            bubVar.j();
            bubVar.c = mubVar;
        }
    }
}
