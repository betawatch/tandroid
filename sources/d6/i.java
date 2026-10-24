package d6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.x6;
import com.google.android.gms.internal.cast.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        } catch (RemoteException e) {
            c.m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        o4 o4Var = cVar.l;
        if (o4Var != null) {
            z5.D(o4Var.a, new x6(new a5.a(3, 2)));
        }
    }
}
