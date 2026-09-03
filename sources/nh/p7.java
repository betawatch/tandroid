package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class p7 implements m2.f {
    public final /* synthetic */ i9 a;
    public final /* synthetic */ y8 b;

    public p7(y8 y8Var, i9 i9Var) {
        this.b = y8Var;
        this.a = i9Var;
    }

    @Override // m2.f
    public final void a(int i10) {
        y8 y8Var = this.b;
        d4 currentPeerView = y8Var.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((z8) y8Var.y0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        y8Var.F();
        i9 i9Var = this.a;
        e9 e9Var = i9Var.q0;
        if (e9Var != null) {
            if (i10 < 3) {
                e9Var.b(false);
            } else if (i10 > y8Var.w0.b() - 4) {
                i9Var.q0.b(true);
            }
        }
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        y8 y8Var = this.b;
        y8Var.F0 = i10;
        y8Var.G0 = i11 > 0 ? i10 + 1 : i10 - 1;
        y8Var.H0 = f10;
        long j10 = UserConfig.getInstance(y8Var.v0).clientUserId;
        int i12 = y8Var.F0;
        if (i12 >= 0 && (y8Var.u0 != null ? y8Var.t0 == j10 : !(i12 >= y8Var.x0.size() || ((Long) y8Var.x0.get(y8Var.F0)).longValue() != j10))) {
            ((z8) y8Var.y0).d(1.0f - y8Var.H0);
            return;
        }
        int i13 = y8Var.G0;
        if (i13 < 0 || (y8Var.u0 != null ? y8Var.t0 != j10 : i13 >= y8Var.x0.size() || ((Long) y8Var.x0.get(y8Var.G0)).longValue() != j10)) {
            ((z8) y8Var.y0).d(0.0f);
        } else {
            ((z8) y8Var.y0).d(y8Var.H0);
        }
    }

    @Override // m2.f
    public final void c(int i10) {
        y8 y8Var = this.b;
        ((z8) y8Var.y0).d.P();
        Runnable runnable = y8Var.D0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            y8Var.D0 = null;
        }
        y8Var.C0 = i10;
        i9 i9Var = y8Var.N0;
        if (i9Var.k0.C0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(i9Var.Y0);
        }
    }
}
