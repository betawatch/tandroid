package d6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.internal.cast.y6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
            Parcel O0 = oVar.O0();
            int i10 = com.google.android.gms.internal.cast.v.a;
            O0.writeInt(0);
            oVar.S0(O0, 1);
        } catch (RemoteException e7) {
            c.m.a(e7, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        q4 q4Var = cVar.l;
        if (q4Var != null) {
            cf.c.y(q4Var.a, new y6(new a5.a(3, 2)));
        }
    }
}
