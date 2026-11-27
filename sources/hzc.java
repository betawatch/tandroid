// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
