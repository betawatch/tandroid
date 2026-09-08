package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d0 extends w {
    public final IBinder g;
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g gVar, int i10, IBinder iBinder, Bundle bundle) {
        super(gVar, i10, bundle);
        this.h = gVar;
        this.g = iBinder;
    }

    @Override // n6.w
    public final void a(k6.a aVar) {
        g gVar = this.h;
        m mVar = gVar.K;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.a).onConnectionFailed(aVar);
        }
        gVar.z(aVar);
    }

    @Override // n6.w
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            l.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.h;
            if (!gVar.v().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + gVar.v() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface q6 = gVar.q(iBinder);
            if (q6 == null || !(g.E(gVar, 2, 4, q6) || g.E(gVar, 3, 4, q6))) {
                return false;
            }
            gVar.O = null;
            Bundle s10 = gVar.s();
            m mVar = gVar.J;
            if (mVar == null) {
                return true;
            }
            ((com.google.android.gms.common.api.k) mVar.a).onConnected(s10);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
