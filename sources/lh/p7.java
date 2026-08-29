package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class p7 implements m2.e {
    public final /* synthetic */ i9 a;
    public final /* synthetic */ y8 b;

    public p7(y8 y8Var, i9 i9Var) {
        this.b = y8Var;
        this.a = i9Var;
    }

    @Override // m2.e
    public final void a(int i10) {
        y8 y8Var = this.b;
        d4 currentPeerView = y8Var.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((z8) y8Var.x0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        y8Var.F();
        i9 i9Var = this.a;
        e9 e9Var = i9Var.p0;
        if (e9Var != null) {
            if (i10 < 3) {
                e9Var.d(false);
            } else if (i10 > y8Var.v0.b() - 4) {
                i9Var.p0.d(true);
            }
        }
    }

    @Override // m2.e
    public final void b(float f9, int i10, int i11) {
        y8 y8Var = this.b;
        y8Var.E0 = i10;
        y8Var.F0 = i11 > 0 ? i10 + 1 : i10 - 1;
        y8Var.G0 = f9;
        long j10 = UserConfig.getInstance(y8Var.u0).clientUserId;
        int i12 = y8Var.E0;
        if (i12 >= 0 && (y8Var.t0 != null ? y8Var.s0 == j10 : !(i12 >= y8Var.w0.size() || ((Long) y8Var.w0.get(y8Var.E0)).longValue() != j10))) {
            ((z8) y8Var.x0).d(1.0f - y8Var.G0);
            return;
        }
        int i13 = y8Var.F0;
        if (i13 < 0 || (y8Var.t0 != null ? y8Var.s0 != j10 : i13 >= y8Var.w0.size() || ((Long) y8Var.w0.get(y8Var.F0)).longValue() != j10)) {
            ((z8) y8Var.x0).d(0.0f);
        } else {
            ((z8) y8Var.x0).d(y8Var.G0);
        }
    }

    @Override // m2.e
    public final void c(int i10) {
        y8 y8Var = this.b;
        ((z8) y8Var.x0).d.P();
        Runnable runnable = y8Var.C0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            y8Var.C0 = null;
        }
        y8Var.B0 = i10;
        i9 i9Var = y8Var.M0;
        if (i9Var.j0.B0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(i9Var.X0);
        }
    }
}
