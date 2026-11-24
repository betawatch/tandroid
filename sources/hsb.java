// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum hsb extends qsb {
    public hsb() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        rpb rpbVar = aqbVar.m;
        char d = zj1Var.d();
        if (d == 0) {
            aqbVar.m(this);
            rpbVar.g.append((char) 65533);
            return;
        }
        if (d == '\"') {
            aqbVar.c = qsb.C0;
            return;
        }
        lqb lqbVar = qsb.a;
        if (d == '>') {
            aqbVar.m(this);
            aqbVar.j();
            aqbVar.c = lqbVar;
        } else {
            if (d != 65535) {
                rpbVar.g.append(d);
                return;
            }
            aqbVar.l(this);
            aqbVar.j();
            aqbVar.c = lqbVar;
        }
    }
}
