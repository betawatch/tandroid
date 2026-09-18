package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class la implements z4.e {
    public final /* synthetic */ jc a;
    public final /* synthetic */ zb b;

    public la(zb zbVar, jc jcVar) {
        this.b = zbVar;
        this.a = jcVar;
    }

    @Override // z4.e
    public final void a(int i10) {
        zb zbVar = this.b;
        f6 currentPeerView = zbVar.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((ac) zbVar.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        zbVar.F();
        jc jcVar = this.a;
        fc fcVar = jcVar.t0;
        if (fcVar != null) {
            if (i10 < 3) {
                fcVar.b(false);
            } else if (i10 > zbVar.z0.b() - 4) {
                jcVar.t0.b(true);
            }
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        zb zbVar = this.b;
        zbVar.I0 = i10;
        zbVar.J0 = i11 > 0 ? i10 + 1 : i10 - 1;
        zbVar.K0 = f7;
        long j3 = UserConfig.getInstance(zbVar.y0).clientUserId;
        int i12 = zbVar.I0;
        if (i12 >= 0 && (zbVar.x0 != null ? zbVar.w0 == j3 : !(i12 >= zbVar.A0.size() || ((Long) zbVar.A0.get(zbVar.I0)).longValue() != j3))) {
            ((ac) zbVar.B0).d(1.0f - zbVar.K0);
            return;
        }
        int i13 = zbVar.J0;
        if (i13 < 0 || (zbVar.x0 != null ? zbVar.w0 != j3 : i13 >= zbVar.A0.size() || ((Long) zbVar.A0.get(zbVar.J0)).longValue() != j3)) {
            ((ac) zbVar.B0).d(0.0f);
        } else {
            ((ac) zbVar.B0).d(zbVar.K0);
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        zb zbVar = this.b;
        ((ac) zbVar.B0).d.P();
        Runnable runnable = zbVar.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            zbVar.G0 = null;
        }
        zbVar.F0 = i10;
        jc jcVar = zbVar.Q0;
        if (jcVar.n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(jcVar.b1);
        }
    }
}
