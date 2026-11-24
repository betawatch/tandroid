// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum jrb extends qsb {
    public jrb() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        brb brbVar = qsb.X;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            aqbVar.c = brbVar;
            return;
        }
        if (d == '/') {
            aqbVar.c = qsb.f0;
            return;
        }
        lqb lqbVar = qsb.a;
        if (d == '>') {
            aqbVar.k();
            aqbVar.c = lqbVar;
        } else if (d == 65535) {
            aqbVar.l(this);
            aqbVar.c = lqbVar;
        } else {
            aqbVar.m(this);
            zj1Var.q();
            aqbVar.c = brbVar;
        }
    }
}
