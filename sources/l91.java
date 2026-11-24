// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
