package g6;

import a8.r7;
import a8.wa;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.s6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i {
    public final /* synthetic */ c a;

    public i(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        c cVar = this.a;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        try {
            h6.h hVar = cVar.j;
            if (hVar != null) {
                hVar.u();
            }
            o oVar = (o) qVar;
            Parcel P0 = oVar.P0();
            int i7 = com.google.android.gms.internal.cast.t.a;
            P0.writeInt(0);
            oVar.T0(P0, 1);
        } catch (RemoteException e10) {
            c.m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        l4 l4Var = cVar.l;
        if (l4Var != null) {
            r7.K(l4Var.a, new s6(new wa(3, 4)));
        }
    }
}
