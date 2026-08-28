package nh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a0 implements p0 {
    public final /* synthetic */ o2 a;
    public final /* synthetic */ j0 b;

    public a0(j0 j0Var, o2 o2Var) {
        this.b = j0Var;
        this.a = o2Var;
    }

    @Override // nh.p0
    public final void a(long j10) {
        this.a.presentFragment(qn.R9(j10));
        this.b.dismiss();
    }

    @Override // nh.p0
    public final void c() {
        j0 j0Var = this.b;
        j0Var.w.d.U2.N(true);
        j0Var.v.d.U2.N(true);
    }

    @Override // nh.p0
    public final void close() {
        this.b.d.D(0);
    }
}
