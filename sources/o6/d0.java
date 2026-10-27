package o6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    @Override // o6.w
    public final void a(l6.a aVar) {
        g gVar = this.h;
        m mVar = gVar.K;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.a).onConnectionFailed(aVar);
        }
        gVar.z(aVar);
    }

    @Override // o6.w
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
            IInterface q5 = gVar.q(iBinder);
            if (q5 == null || !(g.E(gVar, 2, 4, q5) || g.E(gVar, 3, 4, q5))) {
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
