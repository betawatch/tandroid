// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hzc extends d6 {
    public final /* synthetic */ jzc a;

    public hzc(jzc jzcVar) {
        this.a = jzcVar;
    }

    @Override // d6
    public final void b(int i) {
        jzc jzcVar = this.a;
        r47 r47Var = jzcVar.n;
        if (i == -1) {
            jzcVar.finishFragment();
            return;
        }
        if (i != 1) {
            if (i == 2) {
                jzc.Z(jzcVar.d, r47Var, jzcVar.getParentActivity(), jzcVar.r, jzcVar.e);
            }
        } else if (r47Var != null) {
            r47Var.k.with_my_score = false;
            jzcVar.showDialog(kea.H0(jzcVar.getParentActivity(), r47Var, null, false, jzcVar.h));
        }
    }
}
