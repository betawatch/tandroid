// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum iwb extends rwb {
    public iwb() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        stb stbVar = bubVar.m;
        char d = ik1Var.d();
        if (d == 0) {
            bubVar.m(this);
            stbVar.g.append((char) 65533);
            return;
        }
        if (d == '\"') {
            bubVar.c = rwb.C0;
            return;
        }
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.m(this);
            bubVar.j();
            bubVar.c = mubVar;
        } else {
            if (d != 65535) {
                stbVar.g.append(d);
                return;
            }
            bubVar.l(this);
            bubVar.j();
            bubVar.c = mubVar;
        }
    }
}
