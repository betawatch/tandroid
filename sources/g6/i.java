package g6;

import a8.r7;
import a8.xa;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.s6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
            Parcel p12 = oVar.p1();
            int i7 = com.google.android.gms.internal.cast.t.a;
            p12.writeInt(0);
            oVar.t1(p12, 1);
        } catch (RemoteException e10) {
            c.m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        l4 l4Var = cVar.l;
        if (l4Var != null) {
            r7.O(l4Var.a, new s6(new xa(3, 4)));
        }
    }
}
