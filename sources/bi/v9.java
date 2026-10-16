package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class v9 implements z4.e {
    public final /* synthetic */ sb a;
    public final /* synthetic */ ib b;

    public v9(ib ibVar, sb sbVar) {
        this.b = ibVar;
        this.a = sbVar;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        ib ibVar = this.b;
        ibVar.I0 = i10;
        ibVar.J0 = i11 > 0 ? i10 + 1 : i10 - 1;
        ibVar.K0 = f7;
        long j10 = UserConfig.getInstance(ibVar.y0).clientUserId;
        int i12 = ibVar.I0;
        if (i12 >= 0 && (ibVar.x0 != null ? ibVar.w0 == j10 : !(i12 >= ibVar.A0.size() || ((Long) ibVar.A0.get(ibVar.I0)).longValue() != j10))) {
            ((jb) ibVar.B0).d(1.0f - ibVar.K0);
            return;
        }
        int i13 = ibVar.J0;
        if (i13 < 0 || (ibVar.x0 != null ? ibVar.w0 != j10 : i13 >= ibVar.A0.size() || ((Long) ibVar.A0.get(ibVar.J0)).longValue() != j10)) {
            ((jb) ibVar.B0).d(0.0f);
        } else {
            ((jb) ibVar.B0).d(ibVar.K0);
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        ib ibVar = this.b;
        q5 currentPeerView = ibVar.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((jb) ibVar.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        ibVar.F();
        sb sbVar = this.a;
        ob obVar = sbVar.t0;
        if (obVar != null) {
            if (i10 < 3) {
                obVar.b(false);
            } else if (i10 > ibVar.z0.b() - 4) {
                sbVar.t0.b(true);
            }
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        ib ibVar = this.b;
        ((jb) ibVar.B0).d.P();
        Runnable runnable = ibVar.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            ibVar.G0 = null;
        }
        ibVar.F0 = i10;
        sb sbVar = ibVar.Q0;
        if (sbVar.n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(sbVar.b1);
        }
    }
}
