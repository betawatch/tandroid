package fi;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class b0 implements s0 {
    public final /* synthetic */ o2 a;
    public final /* synthetic */ k0 b;

    public b0(k0 k0Var, o2 o2Var) {
        this.b = k0Var;
        this.a = o2Var;
    }

    @Override // fi.s0
    public final void a(long j3) {
        this.a.presentFragment(bo.R9(j3));
        this.b.dismiss();
    }

    @Override // fi.s0
    public final void close() {
        this.b.d.E(0);
    }

    @Override // fi.s0
    public final void e() {
        k0 k0Var = this.b;
        k0Var.w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }
}
