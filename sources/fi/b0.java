package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        this.a.presentFragment(zn.R9(j3));
        this.b.dismiss();
    }

    @Override // fi.s0
    public final void close() {
        this.b.d.E(0);
    }

    @Override // fi.s0
    public final void l() {
        k0 k0Var = this.b;
        k0Var.w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }
}
