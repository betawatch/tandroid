// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
