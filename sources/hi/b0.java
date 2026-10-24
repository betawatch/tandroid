package hi;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class b0 implements r0 {
    public final /* synthetic */ o2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, o2 o2Var) {
        this.b = k0Var;
        this.a = o2Var;
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
    public final void q() {
        k0 k0Var = this.b;
        k0Var.w.d.Z2.N(true);
        k0Var.v.d.Z2.N(true);
    }
}
