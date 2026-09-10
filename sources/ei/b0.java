package ei;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class b0 implements s0 {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, p2 p2Var) {
        this.b = k0Var;
        this.a = p2Var;
    }

    @Override // ei.s0
    public final void F() {
        k0 k0Var = this.b;
        k0Var.w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }

    @Override // ei.s0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // ei.s0
    public final void v(long j3) {
        this.a.presentFragment(eo.R9(j3));
        this.b.dismiss();
    }
}
