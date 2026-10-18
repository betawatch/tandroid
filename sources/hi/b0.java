package hi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class b0 implements r0 {
    public final /* synthetic */ n2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, n2 n2Var) {
        this.b = k0Var;
        this.a = n2Var;
    }

    @Override // hi.r0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // hi.r0
    public final void j(long j10) {
        this.a.presentFragment(sn.W9(j10));
        this.b.dismiss();
    }

    @Override // hi.r0
    public final void p() {
        k0 k0Var = this.b;
        k0Var.w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
