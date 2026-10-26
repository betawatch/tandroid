package e6;

import a8.me;
import a8.ng;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.t6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
            f6.h hVar = cVar.j;
            if (hVar != null) {
                hVar.u();
            }
            o oVar = (o) qVar;
            Parcel N0 = oVar.N0();
            int i10 = com.google.android.gms.internal.cast.t.a;
            N0.writeInt(0);
            oVar.R0(N0, 1);
        } catch (RemoteException e) {
            c.m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        l4 l4Var = cVar.l;
        if (l4Var != null) {
            me.D(l4Var.a, new t6(new ng(3, 4)));
        }
    }
}
