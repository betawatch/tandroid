package n5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.w6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            o5.h hVar = cVar.j;
            if (hVar != null) {
                hVar.u();
            }
            o oVar = (o) qVar;
            Parcel M0 = oVar.M0();
            int i9 = com.google.android.gms.internal.cast.u.a;
            M0.writeInt(0);
            oVar.Q0(M0, 1);
        } catch (RemoteException e10) {
            c.m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        o4 o4Var = cVar.l;
        if (o4Var != null) {
            b3.b.D(o4Var.a, new w6(new a6.a(3, 3)));
        }
    }
}
