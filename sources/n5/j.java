package n5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.u6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j {
    public final /* synthetic */ c a;

    public j(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        c cVar = this.a;
        r rVar = cVar.e;
        if (rVar == null) {
            return;
        }
        try {
            o5.h hVar = cVar.j;
            if (hVar != null) {
                hVar.u();
            }
            p pVar = (p) rVar;
            Parcel M0 = pVar.M0();
            int i10 = com.google.android.gms.internal.cast.t.a;
            M0.writeInt(0);
            pVar.Q0(M0, 1);
        } catch (RemoteException e9) {
            c.m.a(e9, "Unable to call %s on %s.", "onConnected", r.class.getSimpleName());
        }
        m4 m4Var = cVar.l;
        if (m4Var != null) {
            af.h.E(m4Var.a, new u6(new b6.a(3, 3)));
        }
    }
}
