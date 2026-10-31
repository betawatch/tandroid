package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        gVar.A(aVar);
    }

    @Override // n6.w
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            l.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.h;
            if (!gVar.w().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + gVar.w() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface r10 = gVar.r(iBinder);
            if (r10 == null || !(g.F(gVar, 2, 4, r10) || g.F(gVar, 3, 4, r10))) {
                return false;
            }
            gVar.O = null;
            Bundle t10 = gVar.t();
            m mVar = gVar.J;
            if (mVar == null) {
                return true;
            }
            ((com.google.android.gms.common.api.k) mVar.a).onConnected(t10);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
