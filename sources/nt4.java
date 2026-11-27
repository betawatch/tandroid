// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class nt4 extends v79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt4 b;

    public /* synthetic */ nt4(wt4 wt4Var, byte b) {
        this.a = b;
        this.b = wt4Var;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        wt4 wt4Var = this.b;
        switch (b) {
            case 0:
                wt4Var.invalidate();
                break;
            default:
                s7 s7Var = wt4Var.H;
                if (wt4Var.n.J1 && s7Var != null && s7Var.getSearchField() != null) {
                    hl.t1(s7Var.getSearchContainer());
                    break;
                }
                break;
        }
    }
}
