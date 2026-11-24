// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum mrb extends qsb {
    public mrb() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.k("--")) {
            aqbVar.n.s();
            aqbVar.c = qsb.i0;
        } else if (zj1Var.l("DOCTYPE")) {
            aqbVar.c = qsb.o0;
        } else if (zj1Var.k("[CDATA[")) {
            aqbVar.e();
            aqbVar.c = qsb.E0;
        } else {
            aqbVar.m(this);
            aqbVar.a(qsb.g0);
        }
    }
}
