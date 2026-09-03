package b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e0 extends x {
    public final IBinder g;
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g gVar, int i10, IBinder iBinder, Bundle bundle) {
        super(gVar, i10, bundle);
        this.h = gVar;
        this.g = iBinder;
    }

    @Override // b6.x
    public final void a(y5.a aVar) {
        g gVar = this.h;
        n nVar = gVar.H;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.a).onConnectionFailed(aVar);
        }
        gVar.z(aVar);
    }

    @Override // b6.x
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            m.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.h;
            if (!gVar.v().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + gVar.v() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface q10 = gVar.q(iBinder);
            if (q10 == null || !(g.E(gVar, 2, 4, q10) || g.E(gVar, 3, 4, q10))) {
                return false;
            }
            gVar.L = null;
            Bundle s6 = gVar.s();
            n nVar = gVar.G;
            if (nVar == null) {
                return true;
            }
            ((com.google.android.gms.common.api.k) nVar.a).onConnected(s6);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
