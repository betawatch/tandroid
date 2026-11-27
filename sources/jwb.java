// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum jwb extends rwb {
    public jwb() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
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
        if (d == '\'') {
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
