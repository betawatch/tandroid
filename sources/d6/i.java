package d6;

import android.os.Parcel;
import android.os.RemoteException;
import ci.u5;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.w6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
            Parcel N0 = oVar.N0();
            int i10 = com.google.android.gms.internal.cast.v.a;
            N0.writeInt(0);
            oVar.R0(N0, 1);
        } catch (RemoteException e7) {
            c.m.a(e7, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        o4 o4Var = cVar.l;
        if (o4Var != null) {
            u5.E(o4Var.a, new w6(new a5.a(3, 2)));
        }
    }
}
