package fi;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class b0 implements s0 {
    public final /* synthetic */ m2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, m2 m2Var) {
        this.b = k0Var;
        this.a = m2Var;
    }

    @Override // fi.s0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // fi.s0
    public final void e(long j3) {
        this.a.presentFragment(wn.R9(j3));
        this.b.dismiss();
    }

    @Override // fi.s0
    public final void f() {
        k0 k0Var = this.b;
        k0Var.w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }
}
