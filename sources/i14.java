// default package

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i14 extends d34 {
    public final /* synthetic */ e34 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i14(e34 e34Var) {
        super(e34Var, 1);
        this.d = e34Var;
    }

    @Override // d34, k69
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.d.g0 = false;
        }
        super.a(recyclerView, i);
    }

    @Override // d34, k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        e34 e34Var = this.d;
        f14 f14Var = e34Var.R;
        e34Var.U(f14Var.H0());
        super.b(recyclerView, i, i2);
        e24 e24Var = e34Var.T;
        if (e24Var == null || e34Var.Q.getAdapter() != e24Var) {
            return;
        }
        e24 e24Var2 = e24Var.y.a;
        if (e24Var2.G.W.G || e24Var2.F) {
            return;
        }
        if (f14Var.M0() + 20 > e24Var.b()) {
            d24 d24Var = e24Var.y;
            Objects.requireNonNull(d24Var);
            gm.c3(new a14(d24Var, (byte) 1));
        }
    }
}
