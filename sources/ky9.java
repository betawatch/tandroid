// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ky9 extends q55 {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ vz9 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky9(vz9 vz9Var, byte b) {
        super(40);
        this.Q = b;
        this.R = vz9Var;
    }

    @Override // f69
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        switch (this.Q) {
            case 0:
                try {
                    rw3 rw3Var = new rw3((byte) 3, recyclerView.getContext(), this);
                    rw3Var.a = i;
                    v0(rw3Var);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            default:
                try {
                    rw3 rw3Var2 = new rw3((byte) 5, recyclerView.getContext(), this);
                    rw3Var2.a = i;
                    v0(rw3Var2);
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
