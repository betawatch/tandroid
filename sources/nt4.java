// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
