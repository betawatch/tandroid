package hi;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class t2 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ t2(d3 d3Var, int i7) {
        this.a = i7;
        this.b = d3Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
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
