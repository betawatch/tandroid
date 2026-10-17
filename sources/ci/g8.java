package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class g8 implements z4.e {
    public final /* synthetic */ aa a;
    public final /* synthetic */ q9 b;

    public g8(q9 q9Var, aa aaVar) {
        this.b = q9Var;
        this.a = aaVar;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        q9 q9Var = this.b;
        q9Var.I0 = i10;
        q9Var.J0 = i11 > 0 ? i10 + 1 : i10 - 1;
        q9Var.K0 = f7;
        long j10 = UserConfig.getInstance(q9Var.y0).clientUserId;
        int i12 = q9Var.I0;
        if (i12 >= 0 && (q9Var.x0 != null ? q9Var.w0 == j10 : !(i12 >= q9Var.A0.size() || ((Long) q9Var.A0.get(q9Var.I0)).longValue() != j10))) {
            ((r9) q9Var.B0).d(1.0f - q9Var.K0);
            return;
        }
        int i13 = q9Var.J0;
        if (i13 < 0 || (q9Var.x0 != null ? q9Var.w0 != j10 : i13 >= q9Var.A0.size() || ((Long) q9Var.A0.get(q9Var.J0)).longValue() != j10)) {
            ((r9) q9Var.B0).d(0.0f);
        } else {
            ((r9) q9Var.B0).d(q9Var.K0);
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        q9 q9Var = this.b;
        q4 currentPeerView = q9Var.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((r9) q9Var.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        q9Var.F();
        aa aaVar = this.a;
        w9 w9Var = aaVar.t0;
        if (w9Var != null) {
            if (i10 < 3) {
                w9Var.b(false);
            } else if (i10 > q9Var.z0.b() - 4) {
                aaVar.t0.b(true);
            }
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        q9 q9Var = this.b;
        ((r9) q9Var.B0).d.P();
        Runnable runnable = q9Var.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            q9Var.G0 = null;
        }
        q9Var.F0 = i10;
        aa aaVar = q9Var.Q0;
        if (aaVar.n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(aaVar.b1);
        }
    }
}
