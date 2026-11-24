// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ls5 extends k69 {
    public final /* synthetic */ u46 a;
    public final /* synthetic */ xs5 b;

    public ls5(xs5 xs5Var, u46 u46Var) {
        this.b = xs5Var;
        this.a = u46Var;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        xs5 xs5Var = this.b;
        xs5Var.I0();
        if (!xs5Var.L1 || xs5Var.K1) {
            return;
        }
        if (xs5Var.M1 - this.a.M0() < 10) {
            xs5Var.E0();
        }
    }
}
