package gi;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t2 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ t2(d3 d3Var, int i3) {
        this.a = i3;
        this.b = d3Var;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        org.telegram.ui.ActionBar.q0 q0Var;
        switch (this.a) {
            case 0:
                d3 d3Var = this.b;
                d3Var.getClass();
                d3Var.invalidate();
                break;
            default:
                d3 d3Var2 = this.b;
                if (d3Var2.n.J1 && (q0Var = d3Var2.H) != null && q0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(d3Var2.H.getSearchContainer());
                    break;
                }
                break;
        }
    }
}
