// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum jqb extends qsb {
    public jqb() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.o()) {
            aqbVar.d(false);
            aqbVar.c = qsb.I;
        } else {
            aqbVar.h("</");
            aqbVar.c = qsb.f;
        }
    }
}
