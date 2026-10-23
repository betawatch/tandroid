package hi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
