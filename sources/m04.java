// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m04 extends q55 {
    public final /* synthetic */ e34 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m04(e34 e34Var) {
        super(5);
        this.Q = e34Var;
    }

    @Override // q55, u46, f69
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        int n0 = super.n0(i, ki2Var, r69Var);
        e34 e34Var = this.Q;
        if (n0 != 0 && e34Var.E0.getScrollState() == 1) {
            e34Var.Y1 = false;
            e34Var.Z();
        }
        if (e34Var.U0 == null) {
            w04 w04Var = new w04(e34Var, e34Var.d1, e34Var.u1.a(), e34Var.u1.f(), (byte) 0);
            e34Var.U0 = w04Var;
            w04Var.a();
        }
        e34Var.U0.b();
        return n0;
    }

    @Override // f69
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        try {
            w46 w46Var = new w46(recyclerView.getContext(), 2);
            w46Var.a = i;
            v0(w46Var);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
