package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class b0 implements s0 {
    public final /* synthetic */ n2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, n2 n2Var) {
        this.b = k0Var;
        this.a = n2Var;
    }

    @Override // fi.s0
    public final void close() {
        this.b.d.E(0);
    }

    @Override // fi.s0
    public final void k(long j3) {
        this.a.presentFragment(yn.Q9(j3));
        this.b.dismiss();
    }

    @Override // fi.s0
    public final void l() {
        k0 k0Var = this.b;
        k0Var.w.d.f3.N(true);
        k0Var.v.d.f3.N(true);
    }
}
