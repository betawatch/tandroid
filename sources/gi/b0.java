package gi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class b0 implements s0 {
    public final /* synthetic */ n2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, n2 n2Var) {
        this.b = k0Var;
        this.a = n2Var;
    }

    @Override // gi.s0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // gi.s0
    public final void g(long j3) {
        this.a.presentFragment(co.R9(j3));
        this.b.dismiss();
    }

    @Override // gi.s0
    public final void l() {
        k0 k0Var = this.b;
        k0Var.w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }
}
