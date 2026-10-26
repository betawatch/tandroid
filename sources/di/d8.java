package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d8 implements a5.i {
    public final /* synthetic */ y9 a;
    public final /* synthetic */ o9 b;

    public d8(o9 o9Var, y9 y9Var) {
        this.b = o9Var;
        this.a = y9Var;
    }

    @Override // a5.i
    public final void a(int i10) {
        o9 o9Var = this.b;
        q4 currentPeerView = o9Var.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((p9) o9Var.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        o9Var.F();
        y9 y9Var = this.a;
        u9 u9Var = y9Var.t0;
        if (u9Var != null) {
            if (i10 < 3) {
                u9Var.b(false);
            } else if (i10 > o9Var.z0.b() - 4) {
                y9Var.t0.b(true);
            }
        }
    }

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
        o9 o9Var = this.b;
        o9Var.I0 = i10;
        o9Var.J0 = i11 > 0 ? i10 + 1 : i10 - 1;
        o9Var.K0 = f7;
        long j10 = UserConfig.getInstance(o9Var.y0).clientUserId;
        int i12 = o9Var.I0;
        if (i12 >= 0 && (o9Var.x0 != null ? o9Var.w0 == j10 : !(i12 >= o9Var.A0.size() || ((Long) o9Var.A0.get(o9Var.I0)).longValue() != j10))) {
            ((p9) o9Var.B0).d(1.0f - o9Var.K0);
            return;
        }
        int i13 = o9Var.J0;
        if (i13 < 0 || (o9Var.x0 != null ? o9Var.w0 != j10 : i13 >= o9Var.A0.size() || ((Long) o9Var.A0.get(o9Var.J0)).longValue() != j10)) {
            ((p9) o9Var.B0).d(0.0f);
        } else {
            ((p9) o9Var.B0).d(o9Var.K0);
        }
    }

    @Override // a5.i
    public final void c(int i10) {
        o9 o9Var = this.b;
        ((p9) o9Var.B0).d.P();
        Runnable runnable = o9Var.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            o9Var.G0 = null;
        }
        o9Var.F0 = i10;
        y9 y9Var = o9Var.Q0;
        if (y9Var.n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(y9Var.b1);
        }
    }
}
