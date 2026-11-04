package f6;

import android.os.Parcel;
import android.os.RemoteException;
import b8.ke;
import b8.kg;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.t6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            g6.h hVar = cVar.j;
            if (hVar != null) {
                hVar.u();
            }
            o oVar = (o) qVar;
            Parcel P0 = oVar.P0();
            int i3 = com.google.android.gms.internal.cast.u.a;
            P0.writeInt(0);
            oVar.T0(P0, 1);
        } catch (RemoteException e10) {
            c.m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        m4 m4Var = cVar.l;
        if (m4Var != null) {
            ke.P(m4Var.a, new t6(new kg(3, 4)));
        }
    }
}
