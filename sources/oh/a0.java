package oh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class a0 implements p0 {
    public final /* synthetic */ n2 a;
    public final /* synthetic */ j0 b;

    public a0(j0 j0Var, n2 n2Var) {
        this.b = j0Var;
        this.a = n2Var;
    }

    @Override // oh.p0
    public final void b(long j10) {
        this.a.presentFragment(rn.R9(j10));
        this.b.dismiss();
    }

    @Override // oh.p0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // oh.p0
    public final void i() {
        j0 j0Var = this.b;
        j0Var.w.d.U2.N(true);
        j0Var.v.d.U2.N(true);
    }
}
