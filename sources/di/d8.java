package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d8 implements a5.i {
    public final /* synthetic */ y9 a;
    public final /* synthetic */ x b;

    public d8(x xVar, y9 y9Var) {
        this.b = xVar;
        this.a = y9Var;
    }

    @Override // a5.i
    public final void a(int i10) {
        x xVar = this.b;
        q4 currentPeerView = xVar.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((p9) xVar.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        xVar.F();
        y9 y9Var = this.a;
        u9 u9Var = y9Var.t0;
        if (u9Var != null) {
            if (i10 < 3) {
                u9Var.b(false);
            } else if (i10 > xVar.z0.b() - 4) {
                y9Var.t0.b(true);
            }
        }
    }

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
        x xVar = this.b;
        xVar.I0 = i10;
        xVar.J0 = i11 > 0 ? i10 + 1 : i10 - 1;
        xVar.K0 = f7;
        long j10 = UserConfig.getInstance(xVar.y0).clientUserId;
        int i12 = xVar.I0;
        if (i12 >= 0 && (xVar.x0 != null ? xVar.w0 == j10 : !(i12 >= xVar.A0.size() || ((Long) xVar.A0.get(xVar.I0)).longValue() != j10))) {
            ((p9) xVar.B0).d(1.0f - xVar.K0);
            return;
        }
        int i13 = xVar.J0;
        if (i13 < 0 || (xVar.x0 != null ? xVar.w0 != j10 : i13 >= xVar.A0.size() || ((Long) xVar.A0.get(xVar.J0)).longValue() != j10)) {
            ((p9) xVar.B0).d(0.0f);
        } else {
            ((p9) xVar.B0).d(xVar.K0);
        }
    }

    @Override // a5.i
    public final void c(int i10) {
        x xVar = this.b;
        ((p9) xVar.B0).d.Q();
        Runnable runnable = xVar.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            xVar.G0 = null;
        }
        xVar.F0 = i10;
        y9 y9Var = ((o9) xVar).R0;
        if (y9Var.n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(y9Var.b1);
        }
    }
}
