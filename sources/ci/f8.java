package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class f8 implements z4.e {
    public final /* synthetic */ z9 a;
    public final /* synthetic */ p9 b;

    public f8(p9 p9Var, z9 z9Var) {
        this.b = p9Var;
        this.a = z9Var;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        p9 p9Var = this.b;
        p9Var.I0 = i10;
        p9Var.J0 = i11 > 0 ? i10 + 1 : i10 - 1;
        p9Var.K0 = f7;
        long j10 = UserConfig.getInstance(p9Var.y0).clientUserId;
        int i12 = p9Var.I0;
        if (i12 >= 0 && (p9Var.x0 != null ? p9Var.w0 == j10 : !(i12 >= p9Var.A0.size() || ((Long) p9Var.A0.get(p9Var.I0)).longValue() != j10))) {
            ((q9) p9Var.B0).d(1.0f - p9Var.K0);
            return;
        }
        int i13 = p9Var.J0;
        if (i13 < 0 || (p9Var.x0 != null ? p9Var.w0 != j10 : i13 >= p9Var.A0.size() || ((Long) p9Var.A0.get(p9Var.J0)).longValue() != j10)) {
            ((q9) p9Var.B0).d(0.0f);
        } else {
            ((q9) p9Var.B0).d(p9Var.K0);
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        p9 p9Var = this.b;
        p4 currentPeerView = p9Var.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((q9) p9Var.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        p9Var.F();
        z9 z9Var = this.a;
        v9 v9Var = z9Var.t0;
        if (v9Var != null) {
            if (i10 < 3) {
                v9Var.b(false);
            } else if (i10 > p9Var.z0.b() - 4) {
                z9Var.t0.b(true);
            }
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        p9 p9Var = this.b;
        ((q9) p9Var.B0).d.P();
        Runnable runnable = p9Var.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            p9Var.G0 = null;
        }
        p9Var.F0 = i10;
        z9 z9Var = p9Var.Q0;
        if (z9Var.n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(z9Var.b1);
        }
    }
}
