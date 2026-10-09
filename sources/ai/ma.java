package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class ma implements z4.e {
    public final /* synthetic */ kc a;
    public final /* synthetic */ ac b;

    public ma(ac acVar, kc kcVar) {
        this.b = acVar;
        this.a = kcVar;
    }

    @Override // z4.e
    public final void a(int i10) {
        ac acVar = this.b;
        f6 currentPeerView = acVar.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((bc) acVar.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        acVar.F();
        kc kcVar = this.a;
        gc gcVar = kcVar.t0;
        if (gcVar != null) {
            if (i10 < 3) {
                gcVar.b(false);
            } else if (i10 > acVar.z0.b() - 4) {
                kcVar.t0.b(true);
            }
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        ac acVar = this.b;
        acVar.I0 = i10;
        acVar.J0 = i11 > 0 ? i10 + 1 : i10 - 1;
        acVar.K0 = f7;
        long j3 = UserConfig.getInstance(acVar.y0).clientUserId;
        int i12 = acVar.I0;
        if (i12 >= 0 && (acVar.x0 != null ? acVar.w0 == j3 : !(i12 >= acVar.A0.size() || ((Long) acVar.A0.get(acVar.I0)).longValue() != j3))) {
            ((bc) acVar.B0).d(1.0f - acVar.K0);
            return;
        }
        int i13 = acVar.J0;
        if (i13 < 0 || (acVar.x0 != null ? acVar.w0 != j3 : i13 >= acVar.A0.size() || ((Long) acVar.A0.get(acVar.J0)).longValue() != j3)) {
            ((bc) acVar.B0).d(0.0f);
        } else {
            ((bc) acVar.B0).d(acVar.K0);
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        ac acVar = this.b;
        ((bc) acVar.B0).d.P();
        Runnable runnable = acVar.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            acVar.G0 = null;
        }
        acVar.F0 = i10;
        kc kcVar = acVar.Q0;
        if (kcVar.n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(kcVar.b1);
        }
    }
}
