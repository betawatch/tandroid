package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class b0 implements s0 {
    public final /* synthetic */ n2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, n2 n2Var) {
        this.b = k0Var;
        this.a = n2Var;
    }

    @Override // fi.s0
    public final void a(long j3) {
        this.a.presentFragment(bo.R9(j3));
        this.b.dismiss();
    }

    @Override // fi.s0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // fi.s0
    public final void e() {
        k0 k0Var = this.b;
        k0Var.w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }
}
