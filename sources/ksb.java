// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum ksb extends qsb {
    public ksb() {
        super("BogusDoctype", 65);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        lqb lqbVar = qsb.a;
        if (d == '>') {
            aqbVar.j();
            aqbVar.c = lqbVar;
        } else {
            if (d != 65535) {
                return;
            }
            aqbVar.j();
            aqbVar.c = lqbVar;
        }
    }
}
