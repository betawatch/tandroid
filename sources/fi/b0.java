package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        this.a.presentFragment(xn.R9(j3));
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
