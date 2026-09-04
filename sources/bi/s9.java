package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class s9 implements z4.e {
    public final /* synthetic */ pb a;
    public final /* synthetic */ fb b;

    public s9(fb fbVar, pb pbVar) {
        this.b = fbVar;
        this.a = pbVar;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        fb fbVar = this.b;
        fbVar.I0 = i10;
        fbVar.J0 = i11 > 0 ? i10 + 1 : i10 - 1;
        fbVar.K0 = f7;
        long j3 = UserConfig.getInstance(fbVar.y0).clientUserId;
        int i12 = fbVar.I0;
        if (i12 >= 0 && (fbVar.x0 != null ? fbVar.w0 == j3 : !(i12 >= fbVar.A0.size() || ((Long) fbVar.A0.get(fbVar.I0)).longValue() != j3))) {
            ((gb) fbVar.B0).d(1.0f - fbVar.K0);
            return;
        }
        int i13 = fbVar.J0;
        if (i13 < 0 || (fbVar.x0 != null ? fbVar.w0 != j3 : i13 >= fbVar.A0.size() || ((Long) fbVar.A0.get(fbVar.J0)).longValue() != j3)) {
            ((gb) fbVar.B0).d(0.0f);
        } else {
            ((gb) fbVar.B0).d(fbVar.K0);
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        fb fbVar = this.b;
        o5 currentPeerView = fbVar.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((gb) fbVar.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        fbVar.F();
        pb pbVar = this.a;
        lb lbVar = pbVar.t0;
        if (lbVar != null) {
            if (i10 < 3) {
                lbVar.e(false);
            } else if (i10 > fbVar.z0.b() - 4) {
                pbVar.t0.e(true);
            }
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        fb fbVar = this.b;
        ((gb) fbVar.B0).d.P();
        Runnable runnable = fbVar.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            fbVar.G0 = null;
        }
        fbVar.F0 = i10;
        pb pbVar = fbVar.Q0;
        if (pbVar.n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(pbVar.b1);
        }
    }
}
