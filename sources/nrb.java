// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum nrb extends qsb {
    public nrb() {
        super("CommentStart", 44);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        qpb qpbVar = aqbVar.n;
        char d = zj1Var.d();
        prb prbVar = qsb.k0;
        if (d == 0) {
            aqbVar.m(this);
            qpbVar.e.append((char) 65533);
            aqbVar.c = prbVar;
            return;
        }
        if (d == '-') {
            aqbVar.c = qsb.j0;
            return;
        }
        lqb lqbVar = qsb.a;
        if (d == '>') {
            aqbVar.m(this);
            aqbVar.i();
            aqbVar.c = lqbVar;
        } else if (d != 65535) {
            qpbVar.e.append(d);
            aqbVar.c = prbVar;
        } else {
            aqbVar.l(this);
            aqbVar.i();
            aqbVar.c = lqbVar;
        }
    }
}
