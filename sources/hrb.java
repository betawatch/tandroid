// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum hrb extends qsb {
    public hrb() {
        super("Rcdata", 2);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char i = zj1Var.i();
        if (i == 0) {
            aqbVar.m(this);
            zj1Var.a();
            aqbVar.f((char) 65533);
        } else {
            if (i == '&') {
                aqbVar.a(qsb.d);
                return;
            }
            if (i == '<') {
                aqbVar.a(qsb.s);
            } else if (i != 65535) {
                aqbVar.h(zj1Var.g('&', '<', 0));
            } else {
                aqbVar.g(new spb());
            }
        }
    }
}
