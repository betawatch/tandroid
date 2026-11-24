// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class l91 extends a4 {
    public final /* synthetic */ m91 n;

    public l91(m91 m91Var) {
        this.n = m91Var;
    }

    @Override // a4
    public final String i() {
        k91 k91Var = (k91) this.n.a.get();
        if (k91Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + k91Var.a + "]";
    }
}
