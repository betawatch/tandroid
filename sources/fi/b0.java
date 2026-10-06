package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
