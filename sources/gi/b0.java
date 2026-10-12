package gi;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class b0 implements s0 {
    public final /* synthetic */ m2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, m2 m2Var) {
        this.b = k0Var;
        this.a = m2Var;
    }

    @Override // gi.s0
    public final void a(long j10) {
        this.a.presentFragment(fo.W9(j10));
        this.b.dismiss();
    }

    @Override // gi.s0
    public final void b() {
        k0 k0Var = this.b;
        k0Var.w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }

    @Override // gi.s0
    public final void close() {
        this.b.d.D(0);
    }
}
