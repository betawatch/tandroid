package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        this.a.presentFragment(zn.W9(j3));
        this.b.dismiss();
    }

    @Override // fi.s0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // fi.s0
    public final void n() {
        k0 k0Var = this.b;
        k0Var.w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
