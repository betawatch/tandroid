package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s7 implements m2.e {
    public final /* synthetic */ m9 a;
    public final /* synthetic */ c9 b;

    public s7(c9 c9Var, m9 m9Var) {
        this.b = c9Var;
        this.a = m9Var;
    }

    @Override // m2.e
    public final void b(int i9) {
        c9 c9Var = this.b;
        i4 currentPeerView = c9Var.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((d9) c9Var.x0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        c9Var.F();
        m9 m9Var = this.a;
        i9 i9Var = m9Var.p0;
        if (i9Var != null) {
            if (i9 < 3) {
                i9Var.d(false);
            } else if (i9 > c9Var.v0.b() - 4) {
                m9Var.p0.d(true);
            }
        }
    }

    @Override // m2.e
    public final void c(float f10, int i9, int i10) {
        c9 c9Var = this.b;
        c9Var.E0 = i9;
        c9Var.F0 = i10 > 0 ? i9 + 1 : i9 - 1;
        c9Var.G0 = f10;
        long j10 = UserConfig.getInstance(c9Var.u0).clientUserId;
        int i11 = c9Var.E0;
        if (i11 >= 0 && (c9Var.t0 != null ? c9Var.s0 == j10 : !(i11 >= c9Var.w0.size() || ((Long) c9Var.w0.get(c9Var.E0)).longValue() != j10))) {
            ((d9) c9Var.x0).d(1.0f - c9Var.G0);
            return;
        }
        int i12 = c9Var.F0;
        if (i12 < 0 || (c9Var.t0 != null ? c9Var.s0 != j10 : i12 >= c9Var.w0.size() || ((Long) c9Var.w0.get(c9Var.F0)).longValue() != j10)) {
            ((d9) c9Var.x0).d(0.0f);
        } else {
            ((d9) c9Var.x0).d(c9Var.G0);
        }
    }

    @Override // m2.e
    public final void d(int i9) {
        c9 c9Var = this.b;
        ((d9) c9Var.x0).d.P();
        Runnable runnable = c9Var.C0;
        if (runnable != null && i9 == 0) {
            runnable.run();
            c9Var.C0 = null;
        }
        c9Var.B0 = i9;
        m9 m9Var = c9Var.M0;
        if (m9Var.j0.B0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(m9Var.X0);
        }
    }
}
