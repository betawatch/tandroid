package hi;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class u2 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ u2(e3 e3Var, int i7) {
        this.a = i7;
        this.b = e3Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.r0 r0Var;
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                e3Var.getClass();
                e3Var.invalidate();
                break;
            default:
                e3 e3Var2 = this.b;
                if (e3Var2.n.J1 && (r0Var = e3Var2.H) != null && r0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(e3Var2.H.getSearchContainer());
                    break;
                }
                break;
        }
    }
}
