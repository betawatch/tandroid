package hi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class b0 implements r0 {
    public final /* synthetic */ n2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, n2 n2Var) {
        this.b = k0Var;
        this.a = n2Var;
    }

    @Override // hi.r0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // hi.r0
    public final void j(long j10) {
        this.a.presentFragment(qn.W9(j10));
        this.b.dismiss();
    }

    @Override // hi.r0
    public final void l() {
        k0 k0Var = this.b;
        k0Var.w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
