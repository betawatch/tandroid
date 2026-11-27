// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
