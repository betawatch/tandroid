package gi;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b0 implements s0 {
    public final /* synthetic */ m2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, m2 m2Var) {
        this.b = k0Var;
        this.a = m2Var;
    }

    @Override // gi.s0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // gi.s0
    public final void n(long j10) {
        this.a.presentFragment(fo.W9(j10));
        this.b.dismiss();
    }

    @Override // gi.s0
    public final void p() {
        k0 k0Var = this.b;
        k0Var.w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
