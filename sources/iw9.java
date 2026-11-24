// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iw9 extends r35 {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ tx9 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iw9(tx9 tx9Var, byte b) {
        super(40);
        this.Q = b;
        this.R = tx9Var;
    }

    @Override // d49
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        switch (this.Q) {
            case 0:
                try {
                    gv3 gv3Var = new gv3((byte) 3, recyclerView.getContext(), this);
                    gv3Var.a = i;
                    v0(gv3Var);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            default:
                try {
                    gv3 gv3Var2 = new gv3((byte) 5, recyclerView.getContext(), this);
                    gv3Var2.a = i;
                    v0(gv3Var2);
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
