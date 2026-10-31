package d6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.u6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
            e6.h hVar = cVar.j;
            if (hVar != null) {
                hVar.u();
            }
            o oVar = (o) qVar;
            Parcel P0 = oVar.P0();
            int i10 = com.google.android.gms.internal.cast.u.a;
            P0.writeInt(0);
            oVar.T0(P0, 1);
        } catch (RemoteException e) {
            c.m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        m4 m4Var = cVar.l;
        if (m4Var != null) {
            bh.d.O(m4Var.a, new u6(new a5.a(3, 3)));
        }
    }
}
