// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f14 extends q55 {
    public final /* synthetic */ e34 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f14(e34 e34Var) {
        super(8);
        this.Q = e34Var;
    }

    @Override // f69
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        try {
            rw3 rw3Var = new rw3((byte) 2, recyclerView.getContext(), this);
            rw3Var.a = i;
            v0(rw3Var);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
